package com.ezatpanah.hiltfundamentals_youtube.database

import android.util.Log
import com.ezatpanah.hiltfundamentals_youtube.TAG
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(var databaseService: DatabaseService) {
    fun log(msg: String){
        Log.d(TAG,"DatabaseAdapter : $msg")
        databaseService.log(msg)
    }
}