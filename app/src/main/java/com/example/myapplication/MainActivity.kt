package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomView)
        val controller = findNavController(R.id.fragment)




        val fragmentSet = setOf<Int>(
            R.id.firstFragment,
            R.id.secondFragment,
            R.id.thirdFragment,
            R.id.forthFragment
        )

        setupActionBarWithNavController(controller, AppBarConfiguration(fragmentSet))
        bottomNavView.setupWithNavController(controller)

    }
}