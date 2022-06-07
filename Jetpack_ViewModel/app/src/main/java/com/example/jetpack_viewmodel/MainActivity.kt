package com.example.jetpack_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack_viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainviewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainviewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainviewModel.numb.observe(this){
           textResul -> binding.textCont.text = textResul.toString()
        }

        binding.buttonClique.setOnClickListener {
            mainviewModel.adicionar()

            mainviewModel.numb.value = (binding.textCont.text as String).toInt()
        }

    }
}