package com.finovate.kotlin.data.model

//val = variable inmutable (no se puede cambiar en kotlin)
//similar a un "const" en typescript

//var si se puede.

data class Account (
    val id: Int,
    val nombre: String,
    val tipo: String, // "Ahorros", "Corriente", "Tarjeta"
    val balance: Double,
    val numero: String,
    val color: String = "#667EEA"
)



