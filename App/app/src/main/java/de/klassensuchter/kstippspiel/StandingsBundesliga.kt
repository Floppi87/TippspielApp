package de.klassensuchter.kstippspiel

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View





class StandingsBundesliga : AppCompatActivity() {

    private lateinit var shared: SharedPreferences
    private var UserLoggedInAsGuest = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings_bundesliga)

        shared = this.getSharedPreferences("SharedPreferences", MODE_PRIVATE)
        UserLoggedInAsGuest = shared.getBoolean("UserLoggedInAsGuest",false)
        if(UserLoggedInAsGuest){
            var view = findViewById<View>(R.id.button_taskbar_1)
            view.visibility = View.GONE
            view = findViewById(R.id.button_taskbar_2)
            view.visibility = View.GONE
            view = findViewById(R.id.button_taskbar_3)
            view.visibility = View.GONE
            view = findViewById(R.id.button_taskbar_4)
            view.visibility = View.GONE
            view = findViewById(R.id.textView)
            view.visibility = View.GONE


        }
    }
}