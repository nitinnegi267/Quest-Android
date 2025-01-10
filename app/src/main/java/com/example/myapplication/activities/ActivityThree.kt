package com.example.myapplication.activities

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.example.myapplication.R

class ActivityThree : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
    }

    override fun onStart() {
        super.onStart()
        Log.e("ActivityThree", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("ActivityThree", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("ActivityThree", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ActivityThree", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ActivityThree", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ActivityThree", "onDestroy")
    }
}