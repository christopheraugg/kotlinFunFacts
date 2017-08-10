package com.example.chrisa.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class FunFactsActivity: AppCompatActivity() {

    lateinit var mFactTextView: TextView
    lateinit var mShowFactButton: Button
    lateinit var mRelativeLayout: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        val mFactBook: FactBook = FactBook()
        val mColorWheel: ColorWheel = ColorWheel()

        mFactTextView = findViewById(R.id.factTextView) as TextView
        mShowFactButton = findViewById(R.id.showFactButton) as Button
        mRelativeLayout = findViewById(R.id.relativeLayout) as RelativeLayout

        mShowFactButton.setOnClickListener {

           val color:Int =  mColorWheel.getColor()

           mFactTextView.setText(mFactBook.getFact())
           mRelativeLayout.setBackgroundColor(color)
           mShowFactButton.setTextColor(color)
       }

    }
}
