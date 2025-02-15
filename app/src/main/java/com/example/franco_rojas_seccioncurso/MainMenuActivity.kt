package com.example.franco_rojas_seccioncurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val btnVendedores = findViewById<Button>(R.id.btnVendedores)

        btnVendedores.setOnClickListener {
            val intent = Intent(this, VendedoresActivity::class.java)
            startActivity(intent)
        }
    }
}
