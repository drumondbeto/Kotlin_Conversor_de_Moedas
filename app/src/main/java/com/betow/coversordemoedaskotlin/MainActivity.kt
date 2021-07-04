package com.betow.coversordemoedaskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var campo1: EditText
    lateinit var botao1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        campo1 = findViewById(R.id.nome)
        botao1 = findViewById(R.id.botao)
        botao1.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var textoDigitado = campo1.text.toString()
                Toast.makeText(applicationContext, textoDigitado, Toast.LENGTH_LONG).show()
            }

        })
    }
}