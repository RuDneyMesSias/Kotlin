package com.Rudev.androidmaster.FirstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.androidmaster.R

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val tvResult    =   findViewById<TextView>(R.id.tvResult)
        val name:String = intent.extras?.getString("EXTRA_NOME").orEmpty()
        tvResult.text = "Olá $name"

    }
}