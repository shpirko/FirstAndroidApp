package com.example.firstapp.model

import com.example.firstapp.R
import com.example.firstapp.R.drawable

class DataManager {
    companion object
    {
        private val names = arrayOf(
            "Mauritius",
            "Austria",
            "Oman",
            "Ethiopia",
            "Tanzania",
            "Nicaragua",
            "Estonia",
            "Uganda",
            "Slovenia",
        )
        private val canEnters = arrayOf(
            true,
            true,
            false,
            true,
            true,
            true,
            true,
            true,
            true,
        )
        private val flagImages = arrayOf(
            drawable._001_mauritius,
            drawable._003_austria,
            drawable._004_oman,
            drawable._005_ethiopia,
            drawable._006_tanzania,
            drawable._007_nicaragua,
            drawable._008_estonia,
            drawable._009_uganda,
            drawable._010_slovenia,
        )

        fun getAllCountries(): List<Country>
        {
            val allCountries = mutableListOf<Country>()

            for(i in names.indices)
            {
                allCountries.add(
                    Country(
                        name = names[i],
                        canEnter = canEnters[i],
                        flagImage = flagImages[i]
                    )
                )
            }
            allCountries.shuffle()
            return allCountries
        }
    }
}

