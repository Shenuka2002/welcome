package com.example.splashactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etNumber1: EditText = findViewById(R.id.etNumber1)
        val etNumber2: EditText = findViewById(R.id.etnumber2)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val tvResult:TextView = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener{
            val num1 = etNumber1.text.toString().toDoubleOrNull()
            val num2 = etNumber2.text.toString().toDoubleOrNull()
            if(num1 != null && num2 != null ) {
                val sum = num1 + num2
                tvResult.text = "Result= $sum"
            }else{
                tvResult.text = "Please enter valid number"
            }
        }
    }
}