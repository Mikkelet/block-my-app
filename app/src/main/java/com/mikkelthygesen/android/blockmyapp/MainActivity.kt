package com.mikkelthygesen.android.blockmyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonGetStarted:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGetStarted = findViewById(R.id.button_getstarted)
        buttonGetStarted.setOnClickListener {
            val startSession = StartSession()
            val i = Intent(this,StartSession::class.java)
            startActivity(i)
        }
    }
}
