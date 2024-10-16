package com.fiap.calculadora

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ContaTelefonicaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_conta_telefonica)

        window.statusBarColor = ContextCompat.getColor(this, R.color.rosa)

        val editTextMinutosLocal = findViewById<EditText>(R.id.editTextMinutosLocal)
        val editTextMinutosCelular = findViewById<EditText>(R.id.editTextMinutosCelular)
        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)
        val backArrow = findViewById<ImageView>(R.id.button_voltar)
        backArrow.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        buttonCalcular.setOnClickListener {
            // Valor fixo da assinatura
            val assinatura = 59.90

            // Obtém os minutos das chamadas locais e de celular
            val minutosLocal = editTextMinutosLocal.text.toString().toIntOrNull() ?: 0
            val minutosCelular = editTextMinutosCelular.text.toString().toIntOrNull() ?: 0

            // Calcula os custos
            val custoLocal = minutosLocal * 0.04
            val custoCelular = minutosCelular * 0.20
            val total = assinatura + custoLocal + custoCelular

            // Exibe o resultado
            showResult(assinatura, custoLocal, custoCelular, total)
        }
    }

    private fun showResult(assinatura: Double, custoLocal: Double, custoCelular: Double, total: Double) {
        val intent = Intent(this, ResultadoActivity::class.java).apply {
            putExtra("ASSINATURA", assinatura)
            putExtra("CUSTO_LOCAL", custoLocal)
            putExtra("CUSTO_CELULAR", custoCelular)
            putExtra("TOTAL", total)
        }
        startActivity(intent)
    }
}
