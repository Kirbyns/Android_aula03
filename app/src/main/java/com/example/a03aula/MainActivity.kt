package com.example.a03aula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //declaração dos inputs
        val valor01 : EditText =  findViewById(R.id.editValor1)
        val valor02 : EditText =  findViewById(R.id.editValor2)

        //declaração dos botões
        val btnSomar : Button = findViewById(R.id.btnSomar)
        val btnSubtrair : Button = findViewById(R.id.btnSub)
        val btnMultiplicar : Button = findViewById(R.id.btnMult)
        val btnDividir : Button = findViewById(R.id.btnDiv)



        //SOMAR
       btnSomar.setOnClickListener {
           val valor1 = valor01.text.toString().toFloat()
           val valor2 = valor02.text.toString().toFloat()

           val resultado = valor1 + valor2

           showDialog("A soma é " + resultado)
       }
        //SUBTRAIR
        btnSubtrair.setOnClickListener {
            val valor1 = valor01.text.toString().toFloat()
            val valor2 = valor02.text.toString().toFloat()

            val resultado = valor1 - valor2

            showDialog("A subtração dos numeros é" + resultado)
        }

        //MULTIPLICAR
        btnMultiplicar.setOnClickListener {
            val valor1 = valor01.text.toString().toFloat()
            val valor2 = valor02.text.toString().toFloat()

            val resultado = valor1 * valor2

            showDialog("A Multiplicação dos numeros é" + resultado)
        }

        //DIVIDIR
        btnDividir.setOnClickListener {
            val valor1 = valor01.text.toString().toFloat()
            val valor2 = valor02.text.toString().toFloat()

            val resultado = valor1 / valor2

            showDialog("A Multiplicação dos numeros é" + resultado)
        }

    }

    fun showDialog(msg:String){
         AlertDialog.Builder(this)
             .setMessage(msg)
             .setPositiveButton("ok", null)
             .create()
             .show()
    }


}