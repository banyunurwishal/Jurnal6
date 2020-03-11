package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AngkaViewModel : ViewModel() {
    private val _poinA = MutableLiveData<Int>()
    private val _poinB = MutableLiveData<Int>()
    val poinA : LiveData<Int>get() = _poinA
    val poinB : LiveData<Int>get() = _poinB

    init {
        _poinB.value = 0
        _poinA.value = 0
    }

    fun tambah1A(){
        _poinA.value = poinA.value?.plus(1)
    }

    fun tambah2A(){
        _poinA.value = poinA.value?.plus(2)
    }

    fun tambah3A(){
        _poinA.value = poinA.value?.plus(3)
    }

    fun tambah1B(){
        _poinB.value = poinB.value?.plus(1)
    }

    fun tambah2B(){
        _poinB.value = poinB.value?.plus(2)
    }

    fun tambah3B(){
        _poinB.value = poinB.value?.plus(3)
    }

    fun reset(){
        _poinA.value = 0
        _poinB.value = 0
    }
}