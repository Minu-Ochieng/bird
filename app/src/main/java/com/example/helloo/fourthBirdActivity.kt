package com.example.helloo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloo.databinding.ActivityFourthBirdBinding
import com.example.helloo.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class fourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnPrev3.setOnClickListener{
            finish()}
        binding.btnNext4.setOnClickListener{
            val intent  = Intent(this,fifthBird::class.java)
            startActivity(intent)

        }
        Picasso.get().load("https://images.unsplash.com/photo-1522926193341-e9ffd686c60f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView8)
    }
}