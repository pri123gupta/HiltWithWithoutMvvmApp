package com.example.hiltwithwithoutmvvmapp.hiltmvvm.db


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.hiltwithwithoutmvvmapp.hiltmvvm.model.Product
import retrofit2.http.GET

@Dao
interface FakerDAO {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addProduct(products : List<Product>)

    @Query("SELECT * FROM Product")
    suspend fun getProducts() : List<Product>

}