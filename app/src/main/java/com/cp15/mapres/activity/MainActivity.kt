package com.cp15.mapres.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cp15.mapres.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getData() : Int {
        return 0
    }

}