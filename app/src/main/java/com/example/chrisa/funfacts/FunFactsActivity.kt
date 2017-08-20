package com.example.chrisa.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fun_facts.*


class FunFactsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        showFactButton.setOnClickListener {

           val color:Int =  ColorWheel.color

           factTextView.text = FactBook.mFact
           relativeLayout.setBackgroundColor(color)
           showFactButton.setTextColor(color)
       }

    }
}
