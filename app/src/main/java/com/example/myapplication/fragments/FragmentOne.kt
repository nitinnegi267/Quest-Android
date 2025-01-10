package com.example.myapplication.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class FragmentOne : Fragment() {

    private lateinit var button: Button

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("FragmentOne", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("FragmentOne", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("FragmentOne", "onCreateView")

        val rootView = inflater.inflate(R.layout.fragment_one, container, false)

        val label = rootView.findViewById<TextView>(R.id.fragment_one_label)
        button = rootView.findViewById<Button>(R.id.fragment_one_button)

        button.setOnClickListener {
            // Go to Fragment Two

            val fragmentTwo = FragmentTwo()

            val bundle = Bundle()
            bundle.putString("some key", "Some Data")
            bundle.putString("key", "Some Data")
            fragmentTwo.arguments = bundle


            val fragmentManager = activity?.supportFragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.add(R.id.container_activity_one, fragmentTwo)
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.commit()
        }

        return rootView
    }

    override fun onStart() {
        Log.e("FragmentOne", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.e("FragmentOne", "onResume")
        super.onResume()
    }

    // Fragment is running

    override fun onPause() {
        Log.e("FragmentOne", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("FragmentOne", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("FragmentOne", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("FragmentOne", "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("FragmentOne", "onDetach")
        super.onDetach()
    }

}