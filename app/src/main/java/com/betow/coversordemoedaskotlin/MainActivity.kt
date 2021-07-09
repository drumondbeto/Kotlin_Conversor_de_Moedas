package com.betow.coversordemoedaskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    lateinit var etValorDolar: EditText
    lateinit var etQtdDolar: EditText
    lateinit var tvValorConvertido: TextView
    lateinit var btConverter: Button
    val dec = DecimalFormat("#,###.00") //2 casas decimais, separando milhar por "," e decimais por "."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etValorDolar = findViewById(R.id.edtxValorDolar)
        etQtdDolar = findViewById(R.id.edtxQtdadeDolar)
        tvValorConvertido = findViewById(R.id.txtResultadoConvertido)
        btConverter = findViewById(R.id.botao)




        btConverter.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {

                var valorDolar = etValorDolar.text.toString().toDouble()
                var qtDolar = etQtdDolar.text.toString().toDouble()

                var valorConvertido = valorDolar * qtDolar

                tvValorConvertido.text = "R$ ${dec.format(valorConvertido)}"

                Toast.makeText(applicationContext, "O valor foi convertido!", Toast.LENGTH_LONG).show()
            }

        })
    }
}

