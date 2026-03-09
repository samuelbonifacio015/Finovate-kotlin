package com.finovate.kotlin.data.model

/**
 * EXPLICACIÓN PARA PRINCIPIANTES:
 * 
 * ¿Qué es un Data Class?
 * Es una clase especial en Kotlin diseñada específicamente para almacenar datos.
 * Nos permite crear objetos que representen entidades de nuestro negocio (Usuario, Cuenta, Transacción).
 * 
 * Características automáticas que genera Kotlin:
 * - equals(): Compara dos objetos por sus propiedades
 * - hashCode(): Para usar en colecciones como HashMap
 * - toString(): Muestra todos los valores de las propiedades
 * - copy(): Para crear copias con algunos valores modificados
 * 
 * EQUIVALENCIA FLUTTER/DART:
 * Flutter:
 * class User {
 *   final int id;
 *   final String nombre;
 *   final String email;
 *   
 *   User({
 *     required this.id,
 *   required this.nombre,
 *   required this.email,
 *   });
 * }
 * 
 * Kotlin (mucho más conciso):
 * data class User(...)
 * 
 * DIFERENCIAS CLAVE:
 * - "data class" = automáticamente genera equals(), hashCode(), toString(), copy()
 * - "val" = inmutable (como "final" en Dart)
 * - "var" = mutable (puede cambiar)
 * - Los parámetros van en el constructor, no en cuerpo separado
 */
data class User(
    // val = esta propiedad NO puede cambiar después de crear el objeto
    // Es como usar "final" en Dart o Java
    val id: Int,           // Int = entero (igual que int en Dart)
    val nombre: String,    // String = texto (igual que String en Dart)
    val email: String     // No hay punto y coma al final (Kotlin no lo necesita)
)
