package com.example.hiltwithwithoutmvvmapp.hiltmvvm.di

import android.content.Context
import androidx.room.Room
import com.example.hiltwithwithoutmvvmapp.hiltmvvm.db.FakerDAO
import com.example.hiltwithwithoutmvvmapp.hiltmvvm.db.FakerDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataBaseModule {
    @Provides
    @Singleton
    fun provideFakerDB(@ApplicationContext context: Context): FakerDB {
        return Room.databaseBuilder(context, FakerDB::class.java, "FakerDB").build()


        //@ApplicationContext  predefined qualifier

    }
}