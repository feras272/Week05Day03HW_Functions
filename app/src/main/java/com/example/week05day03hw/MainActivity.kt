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
    private var buttonLetters:Button? = null
    private var textViewLetters:TextView? = null
    private var sampleString:String = "Feras Alnowiser"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
        printFullName("Feras", "Nasser", "Alnowiser")
        price.addTax()

        sampleString.printLetters()

    }

    private fun connectViews() {
        textViewStart = findViewById(R.id.tv_start_activity_main)
        buttonStart = findViewById(R.id.btn_start_activity_main)
        textViewTax = findViewById(R.id.tv_tax_activity_main)
        buttonTax = findViewById(R.id.btn_tax_activity_main)
        textViewLetters = findViewById(R.id.tv_letters_activity_main)
        buttonLetters = findViewById(R.id.btn_letters_activity_main)
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
        buttonTax?.setOnClickListener {
            val VAT:Double = this * 0.15
            val finalAmount:Double = VAT + this
            textViewTax?.text = finalAmount.toString()
            Toast.makeText(this@MainActivity, finalAmount.toString(), Toast.LENGTH_LONG).show()
        }


    }

    private fun String.printLetters() {

        buttonLetters?.setOnClickListener {

            textViewLetters?.text = this.length.toString()
            Toast.makeText(this@MainActivity,
                "Length of the string is ${this.length}", Toast.LENGTH_LONG).show()
        }


    }


}