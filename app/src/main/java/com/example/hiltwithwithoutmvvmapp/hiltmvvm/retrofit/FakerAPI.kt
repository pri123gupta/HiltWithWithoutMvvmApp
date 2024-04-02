package com.example.hiltwithwithoutmvvmapp.hiltmvvm.retrofit

import com.example.hiltwithwithoutmvvmapp.hiltmvvm.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {
    @GET("products")
    suspend fun getProducts(): Response<List<Product>>
}