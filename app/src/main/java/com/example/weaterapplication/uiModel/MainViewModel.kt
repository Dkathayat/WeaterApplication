package com.example.weaterapplication.uiModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weaterapplication.pojo.details.Daily
import com.example.weaterapplication.utilities.Constant.API_KEY
import kotlinx.coroutines.launch
import javax.security.auth.callback.Callback

class MainViewModel(private val respository: MainRespository): ViewModel() {

    private val weather = MutableLiveData<List<Daily>>()
    val weatherResponse: LiveData<List<Daily>>
    get() = weather

    fun getAllWeather() = viewModelScope.launch {
        respository.getWeatherData().let { response ->
            if (response.is)
        }
    }


}