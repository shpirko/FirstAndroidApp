package com.example.firstapp.logic

import com.example.firstapp.model.Country
import com.example.firstapp.model.DataManager
import com.example.firstapp.utilities.Constants

class GameManager(private val lifeCount:Int = 3) {
    var score: Int = 0
        private set

    private val allCountries: List<Country> = DataManager.getAllCountries()

    var currentInedex: Int = 0
        private set

    var wrongAnswers: Int = 0
        private set

    val currentCountry: Country
        get() = allCountries[currentInedex]

    val isGameEnded: Boolean
        get() = currentInedex == allCountries.size

    val isGameOver: Boolean
        get() = wrongAnswers == lifeCount

    fun checkAnswer(expected: Boolean){
        if(expected == currentCountry.canEnter)

            score += Constants.GameLogic.SCORE_DEFULT
        else
            wrongAnswers++

        currentInedex++

    }

}