package com.Rudev.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.Rudev.androidmaster.FirstApp.PrimeiroAppActivity
import com.example.androidmaster.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSalvarApp =findViewById<Button>(R.id.btnSalvarApp)
        btnSalvarApp.setOnClickListener { navigateToSalvarApp() }
    }

    private fun navigateToSalvarApp(){
        val intent  =   Intent(this, PrimeiroAppActivity::class.java)
        startActivity(intent)
    }
}