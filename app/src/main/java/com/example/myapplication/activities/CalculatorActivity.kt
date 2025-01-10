package com.example.myapplication.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.myapplication.R

// Static Final
const val SOME_VARIABLE = "Some_Variable"

class CalculatorActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var apple = "Apple"


        val mango = "Mango"


        apple = "Grapes"

        setContentView(R.layout.activity_calculator)

        val editText1 = findViewById<EditText>(R.id.edit_text1_id)
        val editText2 = findViewById<EditText>(R.id.edit_text2_id)
        val resultTextView = findViewById<TextView>(R.id.result_text_view)
        val addBtn = findViewById<Button>(R.id.add_button)

        addBtn.setOnClickListener {

            val firstNumber = editText1.text.toString()
            val secondNumber = editText2.text.toString()

            val result = addTwoNumber(firstNumber.toInt(), secondNumber.toInt())

            resultTextView.text = result.toString()

        }

        val myClass1 = MyClass("Apple")

        val myClass2 = MyClass("Mango")
        val myClass3 = MyClass("Grapes")
        val myClass4 = MyClass("Banana")
        val myClass5 = MyClass("Applewfwrefgv")

    }

    fun addTwoNumber(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber + secondNumber
    }
}


class MyClass(val value: String) {


}