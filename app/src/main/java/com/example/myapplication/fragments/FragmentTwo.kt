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

class FragmentTwo : Fragment(){

    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("FragmentTwo", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("FragmentTwo", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("FragmentTwo", "onCreateView")

        val rootView = inflater.inflate(R.layout.fragment_two, container, false)

        val data = arguments?.getString("some key")

        textView = rootView.findViewById<TextView>(R.id.fragment_two_data_label)
        button = rootView.findViewById<Button>(R.id.fragment_two_button)

        textView.text = data

        button.setOnClickListener {
            // Go to Fragment Two

            val fragmentThree = FragmentThree()
            val fragmentManager = activity?.supportFragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.container_activity_one, fragmentThree)
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.commit()
        }

        return rootView
    }

    override fun onStart() {
        Log.e("FragmentTwo", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.e("FragmentTwo", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("FragmentTwo", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("FragmentTwo", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("FragmentTwo", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("FragmentTwo", "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("FragmentTwo", "onDetach")
        super.onDetach()
    }
}