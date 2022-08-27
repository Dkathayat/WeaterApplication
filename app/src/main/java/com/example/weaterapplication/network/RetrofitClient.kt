package com.example.weaterapplication.network

import com.example.weaterapplication.utilities.Constant.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getWeatherService(): WeatherService {
        return retrofit.create(WeatherService::class.java)
    }
}