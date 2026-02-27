package com.finovate.kotlin.data.model

//val = inmutable (no se puede cambiar en kotlin)
//similar a un "const" en typescript

//var si se puede.
data class User(
    val id: Int,
    val nombre: String,
    val email: String
)