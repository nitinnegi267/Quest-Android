package com.example.myapplication.activities

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.example.myapplication.R

class ActivityFour : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)
    }

    override fun onStart() {
        super.onStart()
        Log.e("ActivityFour", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("ActivityFour", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("ActivityFour", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ActivityFour", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ActivityFour", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ActivityFour", "onDestroy")
    }

}