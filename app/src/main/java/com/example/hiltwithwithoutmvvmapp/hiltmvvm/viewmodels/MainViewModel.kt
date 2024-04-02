package com.example.hiltwithwithoutmvvmapp.hiltmvvm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltwithwithoutmvvmapp.hiltmvvm.model.Product
import com.example.hiltwithwithoutmvvmapp.hiltmvvm.repository.FakerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: FakerRepository) : ViewModel() {

    val productsLiveData: LiveData<List<Product>>
        get() = repository.products

    init {
        viewModelScope.launch {
            delay(1000)
            repository.getProducts()
        }
    }
}