package de.klassensuchter.kstippspiel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)




    }

    fun buttonSignIn(view: View) {
        TODO("opens homescreen if user has accdata saved, else loginscreen")
    }

    fun buttonSignInAsGuest(view: View) {
        TODO("opens homescreen as Guest, therefore only to view current standings etc")
    }



}