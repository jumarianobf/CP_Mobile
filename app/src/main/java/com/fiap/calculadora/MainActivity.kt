package com.fiap.calculadora

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        window.statusBarColor = ContextCompat.getColor(this, R.color.rosa)

        val buttonCalculadora = findViewById<Button>(R.id.button_calculadora)
        val buttonContaTelefonica = findViewById<Button>(R.id.button_conta_telefonica)
        val alunoButton = findViewById<Button>(R.id.button_aluno)

        buttonCalculadora.setOnClickListener {

            val intent = Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)
        }

        buttonContaTelefonica.setOnClickListener {

            val intent = Intent(this, ContaTelefonicaActivity::class.java)
            startActivity(intent)
            finish()
        }

        alunoButton.setOnClickListener {
            showDeveloperDialog()
        }

    }

    private fun showDeveloperDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Desenvolvido por")
        builder.setMessage("Julia Mariano Barsotti Ferreira\nRM: 552713\n" +
                "\nLeonardo Gaspar Saheb\nRM: 553383\n" +
                "\nCaio Eduardo Nascimento Martins\nRM: 554025")
        builder.setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }

        // Personalizando a aparência do AlertDialog
        val dialog = builder.create()
        dialog.setOnShowListener {
            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(resources.getColor(R.color.rosa, theme))
        }
        dialog.show()
    }
}