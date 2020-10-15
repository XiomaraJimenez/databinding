package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName(  "Xiomara Rosado")
    private val myAddress : MyAddress = MyAddress("Blackrock", "Ireland")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName=myName
        binding.myAddress=myAddress




        val demoButton: Button =findViewById(R.id.buttonDemo)
        demoButton.setOnClickListener { addNickName() }
    }

    public fun addNickName(){


        Log.i("DEMO", "BUTTON CLICKED")
    }
}