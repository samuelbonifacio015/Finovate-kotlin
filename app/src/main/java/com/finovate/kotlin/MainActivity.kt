package com.finovate.kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.finovate.kotlin.data.model.User

/**
 * ═══════════════════════════════════════════════════════════════════════════
 * EXPLICACIÓN PARA PRINCIPIANTES: ¿Qué es una Activity?
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * Una Activity es como una "PANTALLA" en tu aplicación Android.
 * Es el componente principal que el usuario ve y con el que interactúa.
 * 
 * ANALOGÍA:
 * Piensa en una Activity como una página web o una pantalla en Flutter.
 * Cada pantalla de tu app (Login, Home, Perfil) sería una Activity diferente.
 * 
 * EQUIVALENCIA FLUTTER:
 * Flutter:    class MiPantalla extends StatelessWidget { ... }
 * Android:    class MiActivity : AppCompatActivity() { ... }
 * 
 * Ambos representan una "vista" o "pantalla" que el usuario puede ver.
 * 
 * ─────────────────────────────────────────────────────────────────────────────
 * ¿Qué es AppCompatActivity?
 * ─────────────────────────────────────────────────────────────────────────────
 * Es la clase base que nos da compatibilidad hacia atrás.
 * Permite que nuestra app funcione bien en versiones antiguas de Android
 * mientras usamos características modernas.
 * 
 * Si no usamos AppCompatActivity, tendríamos que usar Activity directamente,
 * pero perderíamos muchas funcionalidades útiles.
 */

// public class MainActivity extends AppCompatActivity { ... }
// En Kotlin, "public" es el modificador por defecto, así que no hace falta escribirlo
class MainActivity : AppCompatActivity() {

    /**
     * ═══════════════════════════════════════════════════════════════════════════
     * onCreate() - El punto de entrada de una Activity
     * ═══════════════════════════════════════════════════════════════════════════
     * 
     * Este método se llama CUANDO se crea la Activity por primera vez.
     * Es como el método initState() en Flutter ( StatelessWidget )
     * o el constructor de un StatefulWidget.
     * 
     * Aquí es donde usualmente:
     * 1. Inicializamos variables
     * 2. Conectamos el layout XML con el código Kotlin
     * 3. Configuramos listeners (botones, etc.)
     * 
     * PARÁMETROS:
     * - savedInstanceState: Bundle? = puede ser null (por eso tiene ?)
     *   Bundle es como un Map<String, dynamic> que guarda datos persistentes
     *   Se usa para restaurar el estado si la activity se recrea (ej: rotación)
     * 
     * FLUTTER EQUIVALENT:
     * @override
     * void initState() {
     *   super.initState();
     *   // inicialización aquí
     * }
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        // ═════════════════════════════════════════════════════════════════════
        // super.onCreate(savedInstanceState)
        // ═════════════════════════════════════════════════════════════════════
        // SIEMPRE debemos llamar a super.onCreate() PRIMERO
        // Esto le dice a Android: "Primero haz tu trabajo interno de crear la Activity"
        // Si no lo haces, la app crasheará
        //
        // Equivalente en Flutter: super.initState() - también va primero
        super.onCreate(savedInstanceState)

        // ═════════════════════════════════════════════════════════════════════
        // setContentView(R.layout.activity_main)
        // ═════════════════════════════════════════════════════════════════════
        // Aquí conectamos el código Kotlin con el layout XML
        // R.layout.activity_main = referencia al archivo res/layout/activity_main.xml
        //
        // "R" = Recursos (Resources) - es una clase automática que Android genera
        // Contiene IDs a todos tus recursos (layouts, strings, colores, etc.)
        //
        // FLUTTER EQUIVALENT:
        // return Scaffold(
        //   body: Center(child: Text('Hola')),
        // );
        // En Android separamos: XML (layout) + Kotlin (lógica)
        setContentView(R.layout.activity_main)

        // ═════════════════════════════════════════════════════════════════════
        // Creando un objeto User (Data Class)
        // ═════════════════════════════════════════════════════════════════════
        
        // Esto es como crear un objeto en Dart:
        // final usuario1 = User(
        //   id: 12,
        //   nombre: 'Samuel',
        //   email: 'samuel@gmail.com',
        // );
        
        // En Kotlin, usamos "val" para variables inmutables (como "final" en Dart)
        // Named parameters: id = 12, nombre = "Samuel" (el orden no importa)
        val usuario1 = User(
            id = 12,
            nombre = "Samuel",
            email = "samuel@gmail.com"
        )

        // ═════════════════════════════════════════════════════════════════════
        // println() - Imprimir en consola
        // ═════════════════════════════════════════════════════════════════════
        // print() o println() funcionan como print() en Dart
        // En Android, también puedes ver estos logs en Logcat
        //
        // $usuario1 = interpolate string (como ${variable} en Dart)
        // ${usuario1.id} = acceder a propiedad del objeto
        println("Usuario creado: $usuario1")
        println("Id: ${usuario1.id}")
        println("Nombre: ${usuario1.nombre}")
        println("Email: ${usuario1.email}")

        /**
         * ═════════════════════════════════════════════════════════════════════
         * EJERCICIO PARA TI:
         * ═════════════════════════════════════════════════════════════════════
         * 
         * 1. Busca el archivo activity_main.xml en res/layout/
         * 2. Agrega un TextView con id "nombreTextView"
         * 3. Usa findViewById para obtener referencia y mostrar el nombre
         * 
         * Pista:
         * val textView = findViewById<TextView>(R.id.nombreTextView)
         * textView.text = usuario1.nombre
         * 
         * ¿Te animas a intentarlo?
         */
    }
}

/**
 * ═══════════════════════════════════════════════════════════════════════════
 * RESUMEN DE CONCEPTOS APRENDIDOS
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * ✓ Activity = Pantalla en Android
 * ✓ AppCompatActivity = Clase base con compatibilidad
 * ✓ onCreate() = Se ejecuta al crear la pantalla (como initState)
 * ✓ setContentView() = Conecta layout XML con código Kotlin
 * ✓ R = Clase de recursos automática de Android
 * ✓ Data class = Clase especial para datos (genera métodos automáticos)
 * ✓ val = variable inmutable (como final en Dart)
 * ✓ String interpolation = $variable o ${expresion}
 * 
 * ═══════════════════════════════════════════════════════════════════════════
 * SIGUIENTE: Modificaremos activity_main.xml para mostrar "Hola Finovate"
 * y explicaremos los layouts XML vs código.
 * ═══════════════════════════════════════════════════════════════════════════
 */
