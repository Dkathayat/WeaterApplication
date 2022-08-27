package com.example.weaterapplication.utilities

import android.annotation.SuppressLint

class Time {
    companion object {

        @SuppressLint("SimpleDateFormat")
        fun timeConverter(timestamp: Long) : String{
            val sdf = java.text.SimpleDateFormat("hh:mm a")
            val date = java.util.Date(timestamp * 1000)

            return sdf.format(date);
        }

        @SuppressLint("SimpleDateFormat")
        fun timeConverterToDate(timestamp: Long) : String{
            val sdf = java.text.SimpleDateFormat("EEE',' MMM d")
            val date = java.util.Date(timestamp * 1000)

            return sdf.format(date);
        }
    }
}