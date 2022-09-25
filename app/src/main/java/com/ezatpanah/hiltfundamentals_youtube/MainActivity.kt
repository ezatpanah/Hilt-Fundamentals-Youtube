package com.ezatpanah.hiltfundamentals_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ezatpanah.hiltfundamentals_youtube.database.DatabaseAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var databaseAdapter: DatabaseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"DatabaseAdapter : $databaseAdapter")
        databaseAdapter.log("Hey Hilt")
    }
}