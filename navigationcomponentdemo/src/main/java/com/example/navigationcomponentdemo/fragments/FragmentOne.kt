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

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val label = view.findViewById<TextView>(R.id.fragment_one_label)

        val button = view.findViewById<Button>(R.id.fragment_one_btn)

        button.setOnClickListener {
         //   findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)

            val action =  FragmentOneDirections.actionFragmentOneToFragmentTwo(11)
            findNavController().navigate(action)
        }
    }
}
