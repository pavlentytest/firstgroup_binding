package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    // View binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.editTextText?.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //  TODO("Not yet implemented")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //   TODO("Not yet implemented")
            }

            override fun afterTextChanged(p0: Editable?) {
                //   TODO("Not yet implemented")
                if((p0?.length ?: 0) > 0) {
                    val res = p0.toString().toInt() * 100
                    binding.textView!!.text = res.toString()
                } else {
                    binding.textView!!.text = ""
                }
            }

        })
        binding.button?.setOnClickListener{

        }

    }
}