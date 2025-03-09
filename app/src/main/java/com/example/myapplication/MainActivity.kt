package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNama = findViewById<EditText>(R.id.nama)
        val tombolSapa = findViewById<Button>(R.id.button)
        val teksSapaan = findViewById<TextView>(R.id.greeting)

        tombolSapa.setOnClickListener {
            val nama = inputNama.text.toString()
            teksSapaan.text = "Hello, $nama"
        }
    }
}