package com.example.desafiopractico01

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.desafiopractico01.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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