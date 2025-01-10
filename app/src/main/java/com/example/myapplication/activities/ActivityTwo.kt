package com.example.myapplication.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.myapplication.R

class ActivityTwo : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        Log.e("ActivityTwo", "onCreate")

        val textView = findViewById<TextView>(R.id.textView2ActivityTwo)

        val extras = intent.extras

        if (extras != null) {

            if (!extras.getString("key1").isNullOrEmpty()) {

                val value = extras.getString("key1")
                //The key argument here must match that used in the other activity
                textView.text = value

            } else if (!extras.getString("key2").isNullOrEmpty()) {

                val value = extras.getString("key1")
                //The key argument here must match that used in the other activity
                textView.text = value

            } else {
                textView.text = "Not available"
            }

            when (extras.getString("key1")) {
                null -> {

                }
            }

            val value = extras.getString("key1")
            //The key argument here must match that used in the other activity
            textView.text = value
        }

        textView.setOnClickListener {
            val intent = Intent(this, ActivityThree::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("ActivityTwo", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("ActivityTwo", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("ActivityTwo", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ActivityTwo", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ActivityTwo", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ActivityTwo", "onDestroy")
    }
}