package com.example.andoridfirst

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.InputType
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoridfirst.databinding.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivitySub13Binding
    lateinit var binding4: ActivitySub15Binding
    lateinit var binding5: ActivitySub16Binding
    //    lateinit var binding2: ActivitySub12Binding
//    lateinit var binding3: ActivitySub11Binding
    var flag: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub13Binding.inflate(layoutInflater)
        binding4 = ActivitySub15Binding.inflate(layoutInflater)
        binding5 = ActivitySub16Binding.inflate(layoutInflater)
//        binding2 = ActivitySub12Binding.inflate(layoutInflater)
//        binding3 = ActivitySub11Binding.inflate(layoutInflater)
        setContentView(binding5.root)

        binding5.tvLongClick.setOnLongClickListener {
            binding5.edtPassword.inputType = InputType.TYPE_NUMBER_VARIATION_NORMAL
            Toast.makeText(applicationContext,binding5.edtPassword.text.toString(), Toast.LENGTH_SHORT).show()
            return@setOnLongClickListener(true)
        }
        binding5.edtPassword.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
//        binding.btnClick.setOnClickListener {
//        if(flag == true){
//            binding.btnTarget.visibility = View.VISIBLE
//            binding.btnGone.visibility = View.VISIBLE
//            flag = false
//        }else{
//            binding.btnTarget.visibility = View.INVISIBLE
//            binding.btnGone.visibility = View.GONE
//            flag = true
//        }
//        }
    }




    }
