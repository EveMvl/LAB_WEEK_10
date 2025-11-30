package com.example.lab_week_10.viewmodels

<<<<<<< HEAD
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.Observer

class TotalViewModel : ViewModel() {

    private val _total = MutableLiveData<Int>()
    val total: LiveData<Int> get() = _total

    init {
        _total.value = 0
    }

    fun incrementTotal() {
        _total.value = (_total.value ?: 0) + 1
=======
import androidx.lifecycle.ViewModel

class TotalViewModel: ViewModel() {
    var total: Int = 0
    fun incrementTotal(): Int {
        total++
        return total
>>>>>>> 7f6ce830b8993aa37a2db28dbc661358c3dd9464
    }
}
