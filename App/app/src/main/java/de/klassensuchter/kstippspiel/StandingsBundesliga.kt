package de.klassensuchter.kstippspiel

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class StandingsBundesliga : AppCompatActivity() {

    private lateinit var shared: SharedPreferences
    private var UserLoggedInAsGuest = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings_bundesliga)

        shared = this.getSharedPreferences("SharedPreferences", MODE_PRIVATE)
        UserLoggedInAsGuest = shared.getBoolean("UserLoggedInAsGuest",false)
        shared.edit().putBoolean("UserLoggedInAsGuest", true).apply()
    }
}