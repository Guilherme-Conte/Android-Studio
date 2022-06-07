package com.example.jetpack_viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {


    val numb = MutableLiveData(0)

    fun adicionar(){
        numb.value = numb.value!!.plus(1)
    }




}



