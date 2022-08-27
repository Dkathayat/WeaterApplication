package com.example.weaterapplication.utilities

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

object Constant {

    const val API_KEY = "f9866fe56db682a308f8290accb7a3c0"

    //        const val BASE_URL = "https://api.openweathermap.org/data/2.5/weather?"
//        const val BASE_URL_FORECAST = "https://api.openweathermap.org/data/2.5/forecast?"
    const val BASE_URL = "https://api.openweathermap.org/data/2.5/"

    @SuppressLint("SimpleDateFormat")
    fun getDate(date: Long): String {
        val timeFormatter = SimpleDateFormat("dd.MM.yyyy")
        return timeFormatter.format(Date(date * 1000L))
    }

}