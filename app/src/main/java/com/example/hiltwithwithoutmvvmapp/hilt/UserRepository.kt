package com.example.hiltwithwithoutmvvmapp.hilt

import android.util.Log
import javax.inject.Inject

const val MY_TAG = "PriyankaGupta"

interface UserRepository {
    fun saveUser(e: String, p: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(e: String, p: String) {
        Log.d(MY_TAG, "saveUser db : $e $p")
    }

}

class FirebaseRepository  : UserRepository {
    override fun saveUser(e: String, p: String) {
        Log.d(MY_TAG, "saveUser fb: $e $p")
    }

}


//class UserRepository @Inject constructor(val loggerService: LoggerService) {
//    fun saveUser(e: String, password: String) {
//        loggerService.log("hey $e ,  $password")
//    }
//}
