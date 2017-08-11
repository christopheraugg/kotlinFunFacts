package com.example.chrisa.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class FunFactsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        val mFactBook: FactBook = FactBook()
        val mColorWheel: ColorWheel = ColorWheel()

        val mFactTextView = findViewById(R.id.factTextView) as TextView
        val mShowFactButton = findViewById(R.id.showFactButton) as Button
        val mRelativeLayout = findViewById(R.id.relativeLayout) as RelativeLayout

        mShowFactButton.setOnClickListener {

           val color:Int =  mColorWheel.color

           mFactTextView.setText(mFactBook.mFact)
           mRelativeLayout.setBackgroundColor(color)
           mShowFactButton.setTextColor(color)
       }

    }
}
