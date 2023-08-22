package com.example.p2_pppb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.p2_pppb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            test1.setOnClickListener{
                Toast.makeText(this@MainActivity, "Hello " + Name.text, Toast.LENGTH_LONG).show()
            }
        }
    }
}