package com.fiap.calculadora

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ContaTelefonicaActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_conta_telefonica)

        val editTextAssinatura = findViewById<EditText>(R.id.editTextAssinatura)
        val editTextMinutosLocal = findViewById<EditText>(R.id.editTextMinutosLocal)
        val editTextMinutosCelular = findViewById<EditText>(R.id.editTextMinutosCelular)
        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)


    }
}