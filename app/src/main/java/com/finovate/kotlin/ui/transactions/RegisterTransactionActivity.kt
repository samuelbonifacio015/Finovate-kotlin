package com.finovate.kotlin.ui.transactions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.finovate.kotlin.databinding.ActivityRegisterTransactionBinding

class RegisterTransactionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterTransactionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterTransactionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}