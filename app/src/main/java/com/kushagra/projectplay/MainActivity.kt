package com.kushagra.projectplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
        //merged?git

        setContentView(R.layout.activity_main)
    }
}