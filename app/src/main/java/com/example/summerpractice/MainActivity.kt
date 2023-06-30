package com.example.summerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.summerpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newBinging = ActivityMainBinding.inflate(layoutInflater)
        binding = newBinging
        setContentView(newBinging.root)

        binding?.button?.setOnClickListener{
            if(binding?.etName?.text?.toString()?.trim()?.equals("") == true || binding?.etName?.text!!.length > 50 || binding?.etHeight?.text?.toString()!!.toInt() > 250 || binding?.etHeight?.text?.toString()!!.toInt() < 0 || binding?.etWeight?.text?.toString()!!.toInt() > 250 || binding?.etWeight?.text?.toString()!!.toInt() < 0 || binding?.etAge?.text?.toString()!!.toInt() < 0 || binding?.etAge?.text?.toString()!!.toInt() > 150) {
                binding?.textView3?.text = "The data is incorrect"
            }else {
                var cnt: Int = binding?.etWeight?.text?.toString()!!.toInt() * 10 + binding?.etHeight?.text?.toString()!!.toInt() * 6 - binding?.etAge?.text?.toString()!!.toInt() * 5 - binding?.etName?.toString()?.length!!.toInt()
                binding?.textView3?.text = "Answer: $cnt"
            }
        }
    }
}