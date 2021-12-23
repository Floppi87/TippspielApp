package de.klassensuchter.kstippspiel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StandingsUsers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings_users)
    }

    fun buttonTaskbarHomescreen(view: View) {
        startActivity(Intent(this, Homescreen::class.java))
        finish()
    }
    fun buttonTaskbarStandingsBundesliga(view: View) {
        startActivity(Intent(this, StandingsBundesliga::class.java))
        finish()
    }
    fun buttonTaskbarSettings(view: View) {
        startActivity(Intent(this, Settings::class.java))
        finish()
    }
}