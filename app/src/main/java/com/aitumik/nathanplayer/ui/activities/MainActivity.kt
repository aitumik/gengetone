package com.aitumik.nathanplayer.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aitumik.nathanplayer.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun init(savedInstanceState: Bundle?) {
        //bind the view to the model
        if(savedInstanceState == null) {
            print("Why is the saved state null")
        }
    }
}