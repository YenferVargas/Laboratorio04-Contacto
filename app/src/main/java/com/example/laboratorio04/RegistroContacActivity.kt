package com.example.laboratorio04


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class RegistroContacActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_contac)

        val intent = Intent(this,ContactoActivity::class.java)

        supportActionBar?.hide()

        val bottom = findViewById<Button>(R.id.btnLlamar)
        bottom.setOnClickListener {
            intent.putExtra("nombre", "Yenifer Vargas")
            intent.putExtra("numero", "928621665")
            startActivity(intent)



        }
        val bottom1 = findViewById<Button>(R.id.btnLlamar1)
        bottom1.setOnClickListener {
            intent.putExtra("nombre", "Maria Mamani")
            intent.putExtra("numero", "992379070")
            startActivity(intent)



        }


    }
}