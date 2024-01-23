package com.example.calculador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x1:EditText = findViewById(R.id.editNum1)
        val x2:EditText = findViewById(R.id.editNum2)
        val suma:Button = findViewById(R.id.btnSumar)
        val resta:Button = findViewById(R.id.btnRestar)
        val multiplica:Button = findViewById(R.id.btnMultiplicar)
        val output:TextView = findViewById(R.id.txtResult)

        suma.setOnClickListener { sumarMetodo(x1, x2, output) }
        resta.setOnClickListener { restarMetodo(x1, x2, output) }
        multiplica.setOnClickListener { multiplicarMetodo(x1, x2, output) }
    }

    private fun sumarMetodo(obj1:EditText, obj2:EditText, res:TextView){
        val num1 = obj1.text.toString().toIntOrNull()
        val num2 = obj2.text.toString().toIntOrNull()
        if (num1 == null || num2 == null) res.text ="Introduzca ambos numeros"
        else{
            res.text = (num1 + num2).toString()
        }

    }

    private fun restarMetodo(obj1:EditText, obj2:EditText, res:TextView){
        val num1 = obj1.text.toString().toIntOrNull()
        val num2 = obj2.text.toString().toIntOrNull()
        if (num1 == null || num2 == null) res.text ="Introduzca ambos numeros"
        else{
            res.text = (num1 - num2).toString()
        }
    }

    private fun multiplicarMetodo(obj1:EditText, obj2:EditText, res:TextView){
        val num1 = obj1.text.toString().toIntOrNull()
        val num2 = obj2.text.toString().toIntOrNull()
        if (num1 == null || num2 == null) res.text ="Introduzca ambos numeros"
        else{
            res.text = (num1 * num2).toString()
        }
    }
}