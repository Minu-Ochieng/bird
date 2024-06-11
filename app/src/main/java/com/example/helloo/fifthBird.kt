package com.example.helloo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloo.databinding.ActivityFifthBirdBinding
import com.example.helloo.databinding.ActivityFourthBirdBinding
import com.example.helloo.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class fifthBird : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnPrev4.setOnClickListener{
            finish()}
        binding.btnPrev4.setOnClickListener{
            val intent  = Intent(this,fifthBird::class.java)
            startActivity(intent)

        }
        Picasso.get().load("https://images.unsplash.com/photo-1518992028580-6d57bd80f2dd?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView3)
    }
}