package com.example.week05day03hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var textViewStart:TextView? = null
    private var buttonStart:Button? = null
    private var textViewTax:TextView? = null
    private var buttonTax:Button? = null
    private var price:Double = 100.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
            printFullName("Feras", "Nasser", "Alnowiser")
            price.addTax()

    }

    private fun connectViews() {
        textViewStart = findViewById(R.id.tv_start_activity_main)
        buttonStart = findViewById(R.id.btn_start_activity_main)
        textViewTax = findViewById(R.id.tv_tax_activity_main)
        buttonTax = findViewById(R.id.btn_tax_activity_main)
    }

    private fun printFullName(vararg fullName:String) {
        buttonStart?.setOnClickListener {
            var yourName:String = ""
            for(name in fullName) {
                yourName = yourName + " " + name
            }
            Toast.makeText(this, yourName, Toast.LENGTH_SHORT).show()
            textViewStart?.text = yourName
        }

    }

    private fun Double.addTax() {
        val VAT:Double = this * 0.15
        val finalAmount:Double = VAT + this

        Toast.makeText(this@MainActivity, finalAmount.toString(), Toast.LENGTH_LONG).show()

    }


}