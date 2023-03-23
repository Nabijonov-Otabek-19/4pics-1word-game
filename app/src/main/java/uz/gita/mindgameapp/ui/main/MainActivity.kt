package uz.gita.mindgameapp.ui.main

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.gita.mindgameapp.databinding.ActivityMainBinding
import uz.gita.mindgameapp.ui.about.AboutActivity
import uz.gita.mindgameapp.ui.game.GameActivity

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: MainPresenter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = MainPresenter(this)
        loadViews()
    }

    private fun loadViews() {
        binding.apply {
            btnStart.setOnClickListener {
                presenter.clickRandomButton()
            }

            btnAbout.setOnClickListener {
                startActivity(Intent(this@MainActivity, AboutActivity::class.java))
            }

            btnQuit.setOnClickListener {
                finishAffinity()
            }
        }
    }

    override fun openGameActivity() {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
}