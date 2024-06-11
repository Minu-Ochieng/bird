package com.example.helloo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloo.databinding.ActivityFourthBirdBinding
import com.example.helloo.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnPrev2.setOnClickListener{
            finish()}
        binding.btnNext3.setOnClickListener{
            val intent  = Intent(this,fifthBird::class.java)
            startActivity(intent)

        }
        Picasso.get().load("https://images.unsplash.com/photo-1520808663317-647b476a81b9?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjd8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView5)
    }
    
}