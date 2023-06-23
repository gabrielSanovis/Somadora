package com.example.somadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var campo1: EditText
    private lateinit var campo2: EditText
    private lateinit var botaoSomar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campo1 = findViewById(R.id.editText1)
        campo2 = findViewById(R.id.editText2)
        botaoSomar = findViewById(R.id.buttonSomar)

        botaoSomar.setOnClickListener {
            val valor1 = if (campo1.text.isNotEmpty()) campo1.text.toString().toFloat() else 0.0f
            val valor2 = if (campo2.text.isNotEmpty()) campo2.text.toString().toFloat() else 0.0f
            val resultado = valor1 + valor2

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("resultado", resultado)
            startActivity(intent)
        }
    }
}