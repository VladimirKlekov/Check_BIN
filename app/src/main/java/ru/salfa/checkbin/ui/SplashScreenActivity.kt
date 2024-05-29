package ru.salfa.checkbin.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import ru.salfa.checkbin.R

class SplashScreenActivity : AppCompatActivity() {

    private var splashScreen: Long = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, AppActivity::class.java))
            finish()
        }, splashScreen)
    }
}