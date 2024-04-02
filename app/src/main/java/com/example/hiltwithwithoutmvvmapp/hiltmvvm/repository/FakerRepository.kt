package com.example.hiltwithwithoutmvvmapp.hiltmvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.hiltwithwithoutmvvmapp.hiltmvvm.db.FakerDB
import com.example.hiltwithwithoutmvvmapp.hiltmvvm.model.Product
import com.example.hiltwithwithoutmvvmapp.hiltmvvm.retrofit.FakerAPI
import javax.inject.Inject

class FakerRepository @Inject constructor(private val api: FakerAPI, private val db: FakerDB) {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products

    suspend fun getProducts()  {
        val result = api.getProducts()
        if (result.isSuccessful && result.body() != null) {
            db.getFakerDAO().addProduct(result.body()!!)
            _products.value = result.body()
        }
    }
}