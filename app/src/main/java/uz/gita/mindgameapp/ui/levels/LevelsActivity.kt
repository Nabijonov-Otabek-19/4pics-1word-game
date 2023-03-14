package uz.gita.mindgameapp.ui.levels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.gita.mindgameapp.R
import uz.gita.mindgameapp.databinding.ActivityLevelsBinding
import uz.gita.mindgameapp.databinding.ActivityMainBinding
import uz.gita.mindgameapp.ui.game.GameActivity

class LevelsActivity : AppCompatActivity(), LevelsContract.View {

    lateinit var binding: ActivityLevelsBinding
    lateinit var presenter: LevelsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = LevelsPresenter(this)
        loadViews()
    }

    private fun loadViews() {
        binding.apply {
            btnAnimals.setOnClickListener {
                presenter.clickCategoryButton(1)
            }
            btnFoods.setOnClickListener {
                presenter.clickCategoryButton(2)
            }
        }
    }

    override fun openGameActivity(category: Int) {
        val intent = Intent(this, GameActivity::class.java)
        intent.putExtra("number", category)
        startActivity(intent)
    }
}