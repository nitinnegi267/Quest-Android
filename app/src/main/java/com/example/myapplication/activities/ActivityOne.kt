package com.example.myapplication.activities

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentActivity
import com.example.myapplication.R
import com.example.myapplication.fragments.FragmentOne
import com.example.myapplication.interfaces.Interface

// static in JAVA : only one time memory
const val b = 2

class ActivityOne : FragmentActivity(), Interface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_one)

        Log.e("ActivityOne", "onCreate")


        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container_activity_one, FragmentOne())
        fragmentTransaction.commit()


        //Companion Object
//        SomeClass.names
//        SomeClass.returnBoolean()
//        ClassOne.add()


        // Constructor + private member declaration
//        val classOneObj = ClassOne(2)
//        val someValue = classOneObj.value

        //  Secondary Constructor
        // val classOneObj = ClassOne(21, "abc")

        // Constructor Inheritance
        // Purpose is to show value gets passed to parent even without calling super.
//        val child = Child(21)
//        child.doSomethingInChild()

//
//        val fragmentTransaction = supportFragmentManager.beginTransaction()
//        fragmentTransaction.add(R.id.container_activity_one, FragmentOne())
//        fragmentTransaction.addToBackStack(null)
//        fragmentTransaction.commit()

        // val button1 = findViewById<Button>(R.id.activity_one_button1)
        //  val button2 = findViewById<Button>(R.id.launch_fragment_button2)
        //  val button3 = findViewById<Button>(R.id.activity_one_button2)

//        button1.setOnClickListener {
//            val value1 = "Pass this data 1"
//            val intent = Intent(this, ActivityTwo::class.java)
//            intent.putExtra("key1", value1)
//            startActivity(intent)//
//        }

//        button2.setOnClickListener {
//            val fragmentTransaction = supportFragmentManager.beginTransaction()
//            fragmentTransaction.add(R.id.container_activity_one, FragmentOne())
//            fragmentTransaction.commit()
//        }

//        button3.setOnClickListener {
//            val value2 = "Pass this data 2"
//            val intent = Intent(this, ActivityTwo::class.java)
//            intent.putExtra("key2", value2)
//            startActivity(intent)//
//        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("ActivityOne", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("ActivityOne", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("ActivityOne", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ActivityOne", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ActivityOne", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ActivityOne", "onDestroy")
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("ActivityOne", "onSaveInstanceState")
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("ActivityOne", "onRestoreInstanceState")
    }

}
