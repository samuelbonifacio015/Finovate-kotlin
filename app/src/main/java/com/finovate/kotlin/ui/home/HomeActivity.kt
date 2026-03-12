package com.finovate.kotlin.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.finovate.kotlin.databinding.ActivityHomeBinding
import kotlin.jvm.java

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.btnNuevaTransaccion.setOnClickListener {
            val intent = Intent(this, RegisterTransactionActivity::class.java)
            startActivity(intent)
        }
    }
}