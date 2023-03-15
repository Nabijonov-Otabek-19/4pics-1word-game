package uz.gita.mindgameapp.ui.game

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.content.ContextCompat
import uz.gita.mindgameapp.R
import uz.gita.mindgameapp.model.QuestionData
import uz.gita.mindgameapp.ui.result.ResultActivity

class GameActivity : AppCompatActivity(), GameContract.View {
    lateinit var imgBack: AppCompatImageView
    lateinit var questionPos: TextView
    private val imageViews = ArrayList<AppCompatImageView>(4)
    private val variantButtons = ArrayList<AppCompatTextView>(12)
    private val answerButtons = ArrayList<AppCompatTextView>(8)
    private lateinit var presenter: GameContract.Presenter
    private lateinit var ans: String
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        loadViews()
        clickEvent()
        val category = intent.getIntExtra("number", 0)
        loadTitle(category)
        presenter = GamePresenter(this, category)
    }

    private fun loadTitle(category: Int) {
        if (category == 1) title = "Animals"
        else if (category == 2) title = "Foods"
        else title = "Classroom"
    }

    private fun loadViews() {
        imageViews.add(findViewById(R.id.imageOne))
        imageViews.add(findViewById(R.id.imageTwo))
        imageViews.add(findViewById(R.id.imageThree))
        imageViews.add(findViewById(R.id.imageFour))
        imgBack = findViewById(R.id.buttonBack)
        questionPos = findViewById(R.id.count)

        imgBack.setOnClickListener {
            finish()
        }

        val answerLine = findViewById<LinearLayoutCompat>(R.id.answerLine)
        for (i in 0 until answerLine.childCount)
            answerButtons.add(answerLine.getChildAt(i) as AppCompatTextView)

        val variantLine1 = findViewById<LinearLayoutCompat>(R.id.variantLine1)
        for (i in 0 until variantLine1.childCount)
            variantButtons.add(variantLine1.getChildAt(i) as AppCompatTextView)

        val variantLine2 = findViewById<LinearLayoutCompat>(R.id.variantLine2)
        for (i in 0 until variantLine2.childCount)
            variantButtons.add(variantLine2.getChildAt(i) as AppCompatTextView)
    }

    private fun clickEvent() {
        variantButtons.forEach { variant ->
            variant.setOnClickListener {
                if (ans.length > count) {
                    count++
                    val st = (it as AppCompatTextView).text
                    it.isClickable = false
                    it.setTextColor(getColor(R.color.gray))
                    presenter.clickVariantButton(st.toString())

                    if (ans.length == count) {
                        presenter.checkAnswer(checkAnswer())
                    }
                }
            }
        }

        answerButtons.forEach {
            it.setOnClickListener {
                val st = (it as AppCompatTextView).text
                returnAnswer(st.toString())

                count--
                it.text = ""
                it.isClickable = false
                it.background = ContextCompat.getDrawable(this, R.drawable.bg_answer_empty)
            }
        }
    }

    private fun returnAnswer(st: String) {
        for (i in 0..variantButtons.size) {
            if (variantButtons[i].text == st && variantButtons[i].currentTextColor == getColor(R.color.gray)) {
                variantButtons[i].setTextColor(getColor(R.color.white))
                variantButtons[i].isClickable = true
                break
            }
        }
    }

    private fun checkAnswer(): String {
        var str = ""
        for (i in answerButtons.indices)
            str += answerButtons[i].text

        return str
    }

    override fun showToast() {
        Toast.makeText(this, "INCORRECT", Toast.LENGTH_SHORT).show()
    }

    override fun describeQuestionData(data: QuestionData, currentPos: Int, total: Int) {
        questionPos.text = "$currentPos/$total"
        imageViews[0].setImageResource(data.image1ResID)
        imageViews[1].setImageResource(data.image2ResID)
        imageViews[2].setImageResource(data.image3ResID)
        imageViews[3].setImageResource(data.image4ResID)

        ans = data.answer
        count = 0
        resizeAnswerButtons(data.answer)
        describeVariant(data.variant)
    }

    override fun showAnswer(value: String, index: Int) {
        answerButtons[index].text = value
        answerButtons[index].background = ContextCompat.getDrawable(this, R.drawable.bg_answer)
        answerButtons[index].isClickable = true
    }

    override fun getFirstEmptyPos(): Int {
        for (i in answerButtons.indices) {
            if (answerButtons[i].visibility == View.VISIBLE
                && answerButtons[i].text.isEmpty()
            ) return i
        }
        return -1
    }

    override fun openResultActivity() {
        startActivity(Intent(this, ResultActivity::class.java))
        finish()
    }

    private fun resizeAnswerButtons(answer: String) {
        for (i in answer.indices) {
            answerButtons[i].visibility = View.VISIBLE
            answerButtons[i].text = ""
            answerButtons[i].background =
                ContextCompat.getDrawable(this, R.drawable.bg_answer_empty)
            answerButtons[i].isClickable = false
        }

        for (i in answer.length until answerButtons.size) {
            answerButtons[i].visibility = View.GONE
            answerButtons[i].text = ""
        }
    }

    private fun describeVariant(variant: String) {
        for (i in variant.indices) {
            variantButtons[i].text = variant[i].toString()
            variantButtons[i].setTextColor(getColor(R.color.white))
            variantButtons[i].isClickable = true
        }
    }
}