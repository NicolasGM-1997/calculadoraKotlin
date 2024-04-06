package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var total: TextView
    private lateinit var btnTotal: Button
    private val calc = Calculadora()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        total = findViewById(R.id.total)
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        btnTotal = findViewById(R.id.btnTotal)
        btnTotal.setOnClickListener {
            val val1 = num1.text.toString().toDouble()
            val val2 = num2.text.toString().toDouble()
            total.text = "Suma: ${calc.sumar(val1, val2)}\nResta: ${calc.restar(val1, val2)}\nMultipicacion: " +
                    "${calc.multiplicar(val1, val2)}\nDivision: ${calc.dividir(val1, val2)}"
        }
    }
}