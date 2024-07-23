package com.example.taskmanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize buttons
        val btnOpenCalculator = findViewById<Button>(R.id.button2)
        val btnOpenTemperatureConverter = findViewById<Button>(R.id.button1)

        // Set up button listeners
        btnOpenCalculator.setOnClickListener {
            openCalculatorApp()
        }

        btnOpenTemperatureConverter.setOnClickListener {
            openTemperatureConverterApp()
        }
    }

    private fun openCalculatorApp() {
        // Create an Intent to launch Calculator app
        val intent = Intent().apply {
            action = "com.example.calculatorapp.SHOW_CALCULATOR"
        }
        startActivity(intent)
    }

    private fun openTemperatureConverterApp() {
        // Create an Intent to launch Temperature Converter app with sample data
        val intent = Intent().apply {
            action = "com.example.temperatureconverter.SHOW_TEMP_CONVERTER"
            putExtra("sample_temperature", 25.0) // Example data
        }
        startActivity(intent)
    }
}
