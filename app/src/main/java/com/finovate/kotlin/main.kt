package com.finovate.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.finovate.kotlin.data.model.User

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val usuario1 = User(
        id = 12,
        nombre = "Samuel",
        email = "samuel@gmail.com"
    )

    println("Usuario creado: $usuario1")
    println("Id: ${usuario1.id}")
    println("Nombre: ${usuario1.nombre}")
    println("Email: ${usuario1.email}")
  }
}
