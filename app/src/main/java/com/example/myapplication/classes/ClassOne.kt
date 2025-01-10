package com.example.myapplication.classes

open class ClassOne(val value: Int) {

    init {
        // Primary constructor block
    }

    constructor(age: Int, name: String) : this(age) {
        // Secondary Constructor

    }

    companion object {

        fun add(): Int {
            return 2
        }
    }

    // Proper Object need to be created.
    fun multiply(): Int {
        return 21
    }
}

object SomeClass {

    var names = String

    fun returnBoolean(): Boolean {
        return true
    }
}



data class MyData(val data: Int){



}