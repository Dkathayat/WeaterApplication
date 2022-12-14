package com.example.weaterapplication.theme

import android.content.Context
import com.example.weaterapplication.R

class ThemeManager {
    companion object {
        fun setCustomizedThemes(context: Context, theme: String?) {
            when (theme) {
                "grey" -> context.setTheme(R.style.Theme_WeaterApplication)
                "black" -> context.setTheme(R.style.Theme1)
                "red" -> context.setTheme(R.style.Theme2)
                "purple" -> context.setTheme(R.style.Theme3)
                "green" -> context.setTheme(R.style.Theme4)
                "blue" -> context.setTheme(R.style.Theme5)
                "orange" -> context.setTheme(R.style.Theme6)
                "pink" -> context.setTheme(R.style.Theme7)
            }
        }
    }
}