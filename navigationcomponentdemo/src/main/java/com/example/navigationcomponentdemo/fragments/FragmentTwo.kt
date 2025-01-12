package com.example.navigationcomponentdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentdemo.R

class FragmentTwo : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val label1 = view.findViewById<TextView>(R.id.fragment_two_label_one)
        val label2 = view.findViewById<TextView>(R.id.fragment_two_label_two)
        val button = view.findViewById<Button>(R.id.fragment_two_btn)

        val safeArgs: FragmentTwoArgs by navArgs()
        val arg2 = safeArgs.arg2

        label2.text = arg2.toString()

        button.setOnClickListener {

            val action =  FragmentTwoDirections.actionFragmentTwoToFragmentThree()
            findNavController().navigate(action)

        }
    }
}
