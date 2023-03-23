package uz.gita.mindgameapp.ui.game

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.widget.AppCompatButton
import uz.gita.mindgameapp.R


class GamePresenter(
    private val view: GameContract.View
) : GameContract.Presenter {

    private var model: GameModel = GameModel()

    init {
        loadNextQuestion()
    }

    override fun showExitDialog() {
        val dialog = Dialog(view as Context)
        dialog.setContentView(R.layout.custom_exit_dialog)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val btnNo: AppCompatButton = dialog.findViewById(R.id.textViewNo)
        val btnYes: AppCompatButton = dialog.findViewById(R.id.textViewYes)

        btnNo.setOnClickListener { dialog.dismiss() }

        btnYes.setOnClickListener {
            dialog.dismiss()
            this.view.closeScreen()
        }
        dialog.create()
        dialog.show()
    }

    override fun checkAnswer(userAnswer: String) {
        if (model.checkAnswer(userAnswer)) {
            val dialog = Dialog(view as Context)
            dialog.setContentView(R.layout.custom_win_dialog)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val btnNext: AppCompatButton = dialog.findViewById(R.id.textViewNext)

            btnNext.setOnClickListener {
                dialog.dismiss()
                loadNextQuestion()
            }
            dialog.create()
            dialog.show()

        } else showInfo()
    }

    private fun showInfo() {
        view.showToast()
    }

    override fun loadNextQuestion() {
        if (model.isLastQuestion()) {
            view.describeQuestionData(
                model.nextQuestionData(),
                model.getCurrentPos(),
                model.getTotal()
            )

        } else view.openResultActivity()
    }

    override fun clickVariantButton(value: String) {
        view.showAnswer(value, view.getFirstEmptyPos())
    }
}