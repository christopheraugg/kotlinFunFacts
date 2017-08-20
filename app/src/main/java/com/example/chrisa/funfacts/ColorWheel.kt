package com.example.chrisa.funfacts

import android.graphics.Color
import java.util.*

class ColorWheel(private val mColors: IntArray = intArrayOf()) {

    private val DEFAULT_COLOR = "#51b46d"
    val color:Int
        get() {
            if (mColors.isNotEmpty()) {
                val randomNumberGenerator = Random()
                return mColors[randomNumberGenerator.nextInt(mColors.size)]
            }
            return Color.parseColor(DEFAULT_COLOR)
        }
}