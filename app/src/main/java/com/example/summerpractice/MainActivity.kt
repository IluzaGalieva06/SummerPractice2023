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
            button?.setOnClickListener{
                val name = etName?.text.toString()
                val height = etHeight?.text.toString().toInt()
                val weight = etWeight?.text.toString().toInt()
                val age = etAge?.text.toString().toInt()
                if(name.trim().equals("") == true || name.length > 50 || height > 250 || height < 0 || weight > 250 || weight < 0 || age < 0 || age > 150) {
                    textView3?.text = "The data is incorrect"
                }else {
                    var cnt: Int = weight * 10 + height * 6 - age * 5 - name.length
                    textView3?.text = "Answer: $cnt"
                }
            }
        }
    }
}