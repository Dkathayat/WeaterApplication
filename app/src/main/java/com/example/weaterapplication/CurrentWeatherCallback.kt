package com.example.weaterapplication

import com.example.weaterapplication.pojo.current.WeatherResponse

    interface CurrentWeatherCallback {
        fun onLoadSuccess(weatherResponse: WeatherResponse?)
        fun onLoadFailure(errorMessage: String?)
    }
