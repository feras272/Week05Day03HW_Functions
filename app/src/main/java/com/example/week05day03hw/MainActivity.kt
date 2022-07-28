package com.example.week05day03hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var textViewStart:TextView? = null
    private var buttonStart:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()

    }

    private fun connectViews() {
        textViewStart = findViewById(R.id.tv_start_activity_main)
        buttonStart = findViewById(R.id.btn_start_activity_main)
    }


}