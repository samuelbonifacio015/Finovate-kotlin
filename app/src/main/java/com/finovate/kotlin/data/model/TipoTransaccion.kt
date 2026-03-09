package com.finovate.kotlin.data.model

/**
 * EXPLICACIÓN PARA PRINCIPIANTES:
 * 
 * ¿Qué es un Enum?
 * Es un tipo de dato que define un conjunto finito de constantes.
 * 
 * Equivalente en Flutter/Dart:
 * enum TipoTransaccion { ingreso, gasto }
 * 
 * En Kotlin, los enums son más potentes y pueden tener propiedades y métodos.
 */
enum class TipoTransaccion {
    // Constantes del enum (como valores de un dropdown)
    INGRESO,
    GASTO
}
