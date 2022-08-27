package com.example.weaterapplication.network

import com.example.weaterapplication.pojo.current.WeatherResponse
import com.example.weaterapplication.pojo.details.FullDetailsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("forecast/hourly?q={city}&appid={APIkey}")
    fun getWeatherData(
        @Query("city") city:String,
        @Query("APIKey") apiKey: String
    ): Call<WeatherResponse>

}