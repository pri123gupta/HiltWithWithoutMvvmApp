package com.example.hiltwithwithoutmvvmapp.hilt

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor(){
    fun log(msg: String) {
        Log.d(MY_TAG, "saveUser: $msg")
    }
}
