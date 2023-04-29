package com.Rudev.androidmaster.FirstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.androidmaster.R

class PrimeiroAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeiro_app)

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etNome = findViewById<AppCompatEditText>(R.id.etNome)


        btnStart.setOnClickListener {
            val nome = etNome.text.toString()

                if (nome.isNotEmpty()) {
                    val intent  =   Intent(this, ResultadoActivity::class.java)
                    intent.putExtra("EXTRA_NOME", nome)
                    startActivity(intent)
            }
        }
    }
}
