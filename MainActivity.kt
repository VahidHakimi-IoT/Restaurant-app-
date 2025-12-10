package com.example.ravintolapetosenkulma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ravintolapetosenkulma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menuItems = listOf(
            MenuItem("Pizza Margherita", "$8.99", "Classic Italian pizza.", R.drawable.pizza),
            MenuItem("Cheeseburger", "$6.49", "Juicy beef patty with cheese.", R.drawable.burger),
            MenuItem("Pasta Alfredo", "$7.99", "Creamy Alfredo pasta.", R.drawable.pasta),
            MenuItem("Fresh Salad", "$4.99", "Healthy salad with fresh greens.", R.drawable.salad)
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MenuAdapter(menuItems)
    }
}
