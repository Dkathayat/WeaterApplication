package com.example.weaterapplication.pojo

import com.example.weaterapplication.CurrentWeatherCallback
import com.example.weaterapplication.DetailedWeatherCallback
import com.example.weaterapplication.pojo.current.WeatherResponse
import com.example.weaterapplication.pojo.details.FullDetailsResponse

class MainContract {

    interface Model {
        fun loadCurrentWeatherData(lat:Double, lon:Double, callback: CurrentWeatherCallback)
        fun loadDetailedWeatherData(lat:Double, lon:Double, callback: DetailedWeatherCallback)
    }
    interface View {
        fun onCurrentDataLoadFinished(currentWeatherResponse: WeatherResponse?)
        fun onDetailedDataLoadFinished(fullDetailsResponse: FullDetailsResponse?)
        fun onLoadFailed(error: String)
    }

    interface Presenter {
        fun startLoadingData(lat:Double, lon:Double)
    }
}