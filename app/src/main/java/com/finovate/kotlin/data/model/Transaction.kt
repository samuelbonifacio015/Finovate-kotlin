package com.finovate.kotlin.data.model

data class Transaction (
    val id: Int,
    val concepto: String,
    val categoria: String,  // "Comida", "Transporte", "Entretenimiento"
    val monto: Double,
    val tipo: TipoTransaccion,
    val fecha: String,
    val icono: String = "S/."
)

enum class TipoTransaccion {
    INGRESO,
    GASTO
}