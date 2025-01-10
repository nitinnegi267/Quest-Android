package com.example.myapplication.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentFour : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("FragmentFour", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("FragmentFour", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("FragmentFour", "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        Log.e("FragmentFour", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.e("FragmentFour", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("FragmentFour", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("FragmentFour", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("FragmentFour", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("FragmentFour", "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("FragmentFour", "onDetach")
        super.onDetach()
    }

}
