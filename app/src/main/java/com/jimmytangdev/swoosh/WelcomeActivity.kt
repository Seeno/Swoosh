package com.jimmytangdev.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { // bundles contain key-value pairs
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java) //explicit intent, specifying what intent we want to go to
            startActivity(leagueIntent)                                               //talking to the OS for say, a camera app, is an implicit intent
        }
    }
}
