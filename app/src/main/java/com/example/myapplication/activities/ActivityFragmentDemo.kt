package com.example.myapplication.activities

import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.FragmentActivity
import com.example.myapplication.R
import com.example.myapplication.fragments.FragmentOne

class ActivityFragmentDemo : FragmentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fragment_demo)


        val container = findViewById<FrameLayout>(R.id.container_activity_one)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container_activity_one, FragmentOne())
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }
}