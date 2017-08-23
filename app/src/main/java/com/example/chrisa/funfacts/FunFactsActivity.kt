package com.example.chrisa.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fun_facts.*
import java.util.*


class FunFactsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        val mFacts = resources.getStringArray(R.array.fact_strings_array)
        val mColors = resources.getIntArray(R.array.fact_colors_array)

        showFactButton.setOnClickListener {

           val randomNumberGenerator = Random()
           val randomNumber:Int = randomNumberGenerator.nextInt(mFacts.size)
           val color:Int = mColors[randomNumber]

           factTextView.text = mFacts[randomNumber]
           relativeLayout.setBackgroundColor(color)
           showFactButton.setTextColor(color)
       }

    }
}
