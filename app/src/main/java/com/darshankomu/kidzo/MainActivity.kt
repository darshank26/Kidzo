package com.darshankomu.kidzo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mNumbers = findViewById<LinearLayout>(R.id.Numbers) as LinearLayout
        val mPlus =  findViewById<LinearLayout>(R.id.plus) as LinearLayout
        val mMinus = findViewById<LinearLayout>(R.id.minus) as LinearLayout

        mNumbers.setOnClickListener {
            startActivity( Intent(this,NumbersList::class.java))
        }

        

        mPlus.setOnClickListener {
            startActivity( Intent(this,PlusList::class.java))
        }

        mMinus.setOnClickListener {
            startActivity( Intent(this,MinusList::class.java))
        }
    }
}
