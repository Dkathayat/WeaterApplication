package com.example.weaterapplication.location

class Location(private val lat: String?, private val lon: String?){

    fun getLat(): String? {
        return lat
    }

    fun getLon(): String? {
        return lon
    }
}