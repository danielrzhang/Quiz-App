package com.derz.thebigquizapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)

        val backButton = findViewById<Button>(R.id.settingsBackButton)
        backButton.setOnClickListener {
            finish()
        }
    }
}