package com.example.weaterapplication.uiModel

import com.example.weaterapplication.network.RetrofitClient
import okhttp3.OkHttpClient

class MainRespository(private val retrofitClient: RetrofitClient) {
    fun getWeatherData() = retrofitClient.getWeatherService()
}