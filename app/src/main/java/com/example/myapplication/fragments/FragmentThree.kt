package com.example.myapplication.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class FragmentThree : Fragment(){

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("FragmentThree", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("FragmentThree", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("FragmentThree", "onCreateView")

        val rootView = inflater.inflate(R.layout.fragment_three, container, false)

        return rootView
    }

    override fun onStart() {
        Log.e("FragmentThree", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.e("FragmentThree", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("FragmentThree", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("FragmentThree", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("FragmentThree", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("FragmentThree", "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("FragmentThree", "onDetach")
        super.onDetach()
    }

}