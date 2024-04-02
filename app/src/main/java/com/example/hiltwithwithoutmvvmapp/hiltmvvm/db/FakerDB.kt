package com.example.hiltwithwithoutmvvmapp.hiltmvvm.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.hiltwithwithoutmvvmapp.hiltmvvm.model.Product

@Database(entities = [Product::class], version = 1)
abstract class FakerDB : RoomDatabase() {
    abstract fun getFakerDAO(): FakerDAO
}