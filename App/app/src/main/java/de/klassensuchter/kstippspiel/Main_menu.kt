package de.klassensuchter.kstippspiel

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Main_menu : AppCompatActivity() {

    private lateinit var shared: SharedPreferences
    private var UserLoggedInAsGuest = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        shared = this.getSharedPreferences("SharedPreferences", MODE_PRIVATE)


    }

    fun buttonSignIn(view: View) {

        if (false) {
            startActivity(Intent(this, Homescreen::class.java))
            finish()

        } else {
            TODO("API-request --> does this user exist")
        }

    }

    fun buttonSignInAsGuest(view: View) {
        startActivity(Intent(this, StandingsBundesliga::class.java))
        finish()
        UserLoggedInAsGuest = shared.getBoolean("UserLoggedInAsGuest", false)
        shared.edit().putBoolean("UserLoggedInAsGuest", true).apply()
    }


}