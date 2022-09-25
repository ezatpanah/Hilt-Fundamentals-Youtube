package com.ezatpanah.hiltfundamentals_youtube.database

import android.util.Log
import com.ezatpanah.hiltfundamentals_youtube.TAG
import javax.inject.Inject


class DatabaseService @Inject constructor() {
    fun log(msg: String){
        Log.d(TAG,"DatabaseService msg : $msg")
    }
}