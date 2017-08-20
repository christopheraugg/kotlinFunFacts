package com.example.chrisa.funfacts

import java.util.*

class FactBook(private val mFacts:Array<String> = arrayOf()) {

    private val DEFAULT_EMPTY_ARRAY_STRING = "There are no facts available!"
    val mFact: String
        get() {
            if (mFacts.isNotEmpty()) {
                val randomNumberGenerator = Random()
                return mFacts[randomNumberGenerator.nextInt(mFacts.size)]
            }
            return DEFAULT_EMPTY_ARRAY_STRING
        }
}