package com.example.somadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val resultado = intent.getFloatExtra("resultado", 0.0f)

        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)
        textViewResultado.text = "${getString(R.string.result_label)} $resultado"
    }
}