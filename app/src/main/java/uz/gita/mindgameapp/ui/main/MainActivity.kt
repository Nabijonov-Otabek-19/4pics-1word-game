package uz.gita.mindgameapp.ui.main

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import uz.gita.mindgameapp.R
import uz.gita.mindgameapp.ui.game.GameActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<AppCompatButton>(R.id.btnStart).setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
    }
}