package com.example.weaterapplication

import com.example.weaterapplication.pojo.details.FullDetailsResponse


    interface DetailedWeatherCallback {
        fun onLoadSuccess(fullDetailsResponse: FullDetailsResponse?)
        fun onLoadFailure(errorMessage: String?)
    }
