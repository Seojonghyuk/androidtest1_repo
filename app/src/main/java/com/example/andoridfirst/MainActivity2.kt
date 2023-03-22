package com.example.andoridfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.CompoundButton
import android.widget.Toast
import com.example.andoridfirst.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity(),CompoundButton.OnCheckedChangeListener{
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ckbClick1.setOnCheckedChangeListener(this)
        binding.ckbClick2.setOnCheckedChangeListener(this)

        binding.ckbClick3.setOnCheckedChangeListener(object:CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                Toast.makeText(applicationContext,"체크박스3번",Toast.LENGTH_SHORT).show()
            }

        })

        binding.ckbClick4.setOnCheckedChangeListener{buttonView: CompoundButton?, isChecked: Boolean ->}
                Toast.makeText(applicationContext,"체크박스4번",Toast.LENGTH_SHORT).show()
    }
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when(buttonView?.id){
            R.id.ckbClick1 -> Toast.makeText(applicationContext,"체크박스1번",Toast.LENGTH_SHORT).show()
            R.id.ckbClick2 -> Toast.makeText(applicationContext,"체크박스2번",Toast.LENGTH_SHORT).show()
        }
    }
}


