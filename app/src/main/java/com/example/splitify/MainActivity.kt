package com.example.splitify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.splitify.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, HomeFragment())
            .commit()
    }
}