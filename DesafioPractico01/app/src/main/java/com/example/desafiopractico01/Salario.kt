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

class Salario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.salario)

        val nom1 = findViewById<EditText>(R.id.txtNombre2)
        val dat1 = findViewById<EditText>(R.id.txtSalarioBase)
        val res1 = findViewById<TextView>(R.id.resSalario)
        val btn1 = findViewById<Button>(R.id.btnSalario)


        btn1.setOnClickListener {
            val nro1 = dat1.text.toString().toInt()
            val isss = nro1 * 0.03
            val afp = nro1 * 0.04
            val renta = nro1 * 0.05
            val salneto = nro1 - (isss + afp + renta)
            res1.text = "$nom1, Tu salario Neto es: ${salneto.toString()} con los descuentos isss:$isss, afp:$afp y renta:$renta"
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