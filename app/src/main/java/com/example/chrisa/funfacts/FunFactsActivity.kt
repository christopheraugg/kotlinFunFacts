package com.example.chrisa.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fun_facts.*


class FunFactsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        val mFacts = FactBook(resources.getStringArray(R.array.fact_strings_array))
        val mColor = ColorWheel(resources.getIntArray(R.array.fact_colors_array))

        showFactButton.setOnClickListener {

           val color:Int = mColor.color

           factTextView.text = mFacts.mFact
           relativeLayout.setBackgroundColor(color)
           showFactButton.setTextColor(color)
       }

    }
}
