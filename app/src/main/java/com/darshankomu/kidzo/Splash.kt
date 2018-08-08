package com.darshankomu.kidzo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {

    internal  val TIME_OUT =  3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(
                {
                    startActivity(Intent(this,MainActivity::class.java))
                    finish()
                },TIME_OUT.toLong())
    }
}
