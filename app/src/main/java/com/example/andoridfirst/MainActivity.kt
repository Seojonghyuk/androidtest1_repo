package com.example.andoridfirst

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.InputType
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoridfirst.databinding.*

class MainActivity : AppCompatActivity() {

    lateinit var binding7: ActivitySub22Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding7 = ActivitySub22Binding.inflate(layoutInflater)
        setContentView(binding7.root)

        binding7.btnselect1.setOnClickListener {
            binding7.screen1.visibility = View.VISIBLE
            binding7.screen2.visibility = View.INVISIBLE
        }
        binding7.btnselect2.setOnClickListener {
            binding7.screen1.visibility = View.INVISIBLE
            binding7.screen2.visibility = View.VISIBLE
        }
        //FramLayout -> LinerLayout 1번화면
        binding7.imgPicture1.setOnClickListener {
            Toast.makeText(this,"1번화면입니다",Toast.LENGTH_SHORT).show()
        }

        //FramLayout -> LinerLayout 2번화면
        binding7.imgPicture2.setOnClickListener {
            Toast.makeText(this,"2번화면입니다",Toast.LENGTH_SHORT).show()
        }


    }


}





