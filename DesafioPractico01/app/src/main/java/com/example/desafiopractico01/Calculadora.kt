package com.example.desafiopractico01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.desafiopractico01.R

class Calculadora : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)

        val dat1 = findViewById<EditText>(R.id.num1)
        val dat2 = findViewById<EditText>(R.id.num2)
        val res1 = findViewById<TextView>(R.id.resCalcu)

        val btn1 = findViewById<Button>(R.id.btnSumar)
        val btn2 = findViewById<Button>(R.id.btnResta)
        val btn3 = findViewById<Button>(R.id.btnMulti)
        val btn4 = findViewById<Button>(R.id.btnDividir)

        btn1.setOnClickListener {
            val nro1 = dat1.text.toString().toInt()
            val nro2 = dat2.text.toString().toInt()
            val suma = nro1 + nro2
            res1.text = "Resultado: ${suma.toString()}"
        }

        btn2.setOnClickListener {
            val nro1 = dat1.text.toString().toInt()
            val nro2 = dat2.text.toString().toInt()
            val rest = nro1 - nro2
            res1.text = "Resultado: ${rest.toString()}"
        }

        btn3.setOnClickListener {
            val nro1 = dat1.text.toString().toInt()
            val nro2 = dat2.text.toString().toInt()
            val multi = nro1 * nro2
            res1.text = "Resultado: ${multi.toString()}"
        }

        btn4.setOnClickListener {
            val nro1 = dat1.text.toString().toInt()
            val nro2 = dat2.text.toString().toInt()
            val div = nro1 / nro2
            res1.text = "Resultado: ${div.toString()}"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.ejer1 -> Toast.makeText(this, "Ejercicio 1", Toast.LENGTH_LONG).show()
            R.id.ejer2 -> Toast.makeText(this, "Ejercicio 2", Toast.LENGTH_LONG).show()
            R.id.ejer3 -> Toast.makeText(this, "Ejercicio 3", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}