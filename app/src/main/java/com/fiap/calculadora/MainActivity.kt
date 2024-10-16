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
        builder.setIcon(R.drawable.costumer)
        builder.setTitle("Desenvolvido por")

        val message = """
        Julia Mariano Barsotti Ferreira
        RM: 552713
        
        Leonardo Gaspar Saheb
        RM: 553383
        
        Caio Eduardo Nascimento Martins
        RM: 554025
    """.trimIndent()
        builder.setMessage(message)

        builder.setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }

        val dialog = builder.create()

        dialog.setOnShowListener {
            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(resources.getColor(R.color.rosa, theme))
        }
        dialog.show()
    }

}