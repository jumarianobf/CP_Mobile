package com.fiap.calculadora
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        window.statusBarColor = ContextCompat.getColor(this, R.color.rosa)

        val backArrow = findViewById<ImageView>(R.id.button_voltar)
        backArrow.setOnClickListener {
            val intent = Intent(this, ContaTelefonicaActivity::class.java)
            startActivity(intent)
            finish()
        }

        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)

        val assinatura = intent.getDoubleExtra("ASSINATURA", 0.0)
        val custoLocal = intent.getDoubleExtra("CUSTO_LOCAL", 0.0)
        val custoCelular = intent.getDoubleExtra("CUSTO_CELULAR", 0.0)
        val total = intent.getDoubleExtra("TOTAL", 0.0)

        val resultadoText = """
            Assinatura          : R$ %.2f
            Chamada Local       : R$ %.2f
            Chamada Celular     : R$ %.2f
            Total               : R$ %.2f
        """.trimIndent().format(assinatura, custoLocal, custoCelular, total)

        textViewResultado.text = resultadoText
    }
}
