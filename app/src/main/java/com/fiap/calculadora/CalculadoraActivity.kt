package com.fiap.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val editTextNumero1 = findViewById<EditText>(R.id.editTextNumero1)
        val editTextNumero2 = findViewById<EditText>(R.id.editTextNumero2)
        val radioGroupOperacoes = findViewById<RadioGroup>(R.id.radioGroupOperacoes)
        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)

        buttonCalcular.setOnClickListener {
            val numero1Str = editTextNumero1.text.toString()
            val numero2Str = editTextNumero2.text.toString()

            if (numero1Str.isEmpty() || numero2Str.isEmpty()) {
                Toast.makeText(this, "Por favor, preencha os dois números.", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            val numero1 = numero1Str.toDouble()
            val numero2 = numero2Str.toDouble()
            var resultado: Double? = null

            when (radioGroupOperacoes.checkedRadioButtonId) {
                R.id.radioButtonSoma -> resultado = numero1 + numero2
                R.id.radioButtonSubtracao -> resultado = numero1 - numero2
                R.id.radioButtonMultiplicacao -> resultado = numero1 * numero2
                R.id.radioButtonDivisao -> {
                    if (numero2 == 0.0) {
                        Toast.makeText(
                            this,
                            "Divisão por zero não é permitida.",
                            Toast.LENGTH_SHORT
                        ).show()
                        return@setOnClickListener
                    }
                    resultado = numero1 / numero2
                }

                else -> {
                    Toast.makeText(this, "Por favor, selecione uma operação.", Toast.LENGTH_SHORT)
                        .show()
                    return@setOnClickListener
                }
            }

            Toast.makeText(this, "Resultado: $resultado", Toast.LENGTH_LONG).show()
        }
    }
}