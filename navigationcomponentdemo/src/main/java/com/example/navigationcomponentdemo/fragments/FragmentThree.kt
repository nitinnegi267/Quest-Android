package com.example.navigationcomponentdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentdemo.R

class FragmentThree : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val label = view.findViewById<TextView>(R.id.fragment_three_label_one)

        val button1 = view.findViewById<Button>(R.id.fragment_three_btn1)
        val button2 = view.findViewById<Button>(R.id.fragment_three_btn2)

        button1.setOnClickListener {
            val action =  FragmentThreeDirections.actionFragmentThreeToFragmentOne()
            findNavController().navigate(action)
        }

        button2.setOnClickListener {
            val action =  FragmentThreeDirections.actionFragmentThreeToFragmentTwo()
            findNavController().navigate(action)
        }
    }
}
