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
        binding?.run {
            binding?.button?.setOnClickListener{
                if(etName?.text.toString().trim().equals("") == true || etName?.text.toString().length > 50 || etHeight?.text.toString().toInt() > 250 || etHeight?.text.toString().toInt() < 0 || etWeight?.text.toString().toInt() > 250 || etWeight?.text.toString().toInt() < 0 || etAge?.text.toString().toInt() < 0 || etAge?.text.toString().toInt() > 150) {
                    textView3?.text = "The data is incorrect"
                }else {
                    var cnt: Int = etWeight?.text.toString().toInt() * 10 + etHeight?.text.toString().toInt() * 6 - etAge?.text.toString().toInt() * 5 - etName?.text.toString().length.toInt()
                    textView3?.text = "Answer: $cnt"
                }
            }
        }
    }
}