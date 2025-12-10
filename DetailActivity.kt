package com.example.ravintolapetosenkulma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ravintolapetosenkulma.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get data sent from MenuAdapter
        val name = intent.getStringExtra("name")
        val price = intent.getStringExtra("price")
        val desc = intent.getStringExtra("desc")
        val image = intent.getIntExtra("image", 0)

        // Update UI
        binding.foodName.text = name
        binding.foodPrice.text = price
        binding.foodDescription.text = desc
        binding.foodImage.setImageResource(image)
    }
}
