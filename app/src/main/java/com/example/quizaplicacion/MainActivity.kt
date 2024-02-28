package com.example.quizaplicacion

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val siBtn = findViewById<Button>(R.id.siBtn)
        val noBtn = findViewById<Button>(R.id.noBtn)

        siBtn.setOnClickListener {
            mostrarMensaje("¡Genial, vamos a continuar!")
        }

        noBtn.setOnClickListener {
            mostrarMensaje("¡Estás bien, sigue así!")
        }
    }

    private fun mostrarMensaje(mensaje: String) {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(mensaje)
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}