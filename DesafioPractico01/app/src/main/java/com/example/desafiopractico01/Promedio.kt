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

class Promedio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.promedio)

        val nom1 = findViewById<EditText>(R.id.txtNombre)
        val dat1 = findViewById<EditText>(R.id.txtNota1)
        val dat2 = findViewById<EditText>(R.id.txtNota2)
        val dat3 = findViewById<EditText>(R.id.txtNota3)
        val dat4 = findViewById<EditText>(R.id.txtNota4)
        val dat5 = findViewById<EditText>(R.id.txtNota5)
        val res1 = findViewById<TextView>(R.id.resPromedio)

        val btn1 = findViewById<Button>(R.id.btnPromediar)

        btn1.setOnClickListener {
            val nro1 = dat1.text.toString().toInt()
            val nro2 = dat2.text.toString().toInt()
            val nro3 = dat3.text.toString().toInt()
            val nro4 = dat4.text.toString().toInt()
            val nro5 = dat5.text.toString().toInt()

            val prom = (nro1 + nro2 + nro3 + nro4 + nro5) / 5
            if (prom >= 6.0){
                res1.text = "Felicidades $nom1 usted Aprobo con: ${prom.toString()}"
            } else{
                res1.text = "Malas noticias $nom1 usted Reprobo con: ${prom.toString()}"
            }
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