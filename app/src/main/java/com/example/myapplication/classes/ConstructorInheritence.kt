package com.example.myapplication.classes

open class Parent(value: Int) {

    init {
        println("Parent Primary Constructor Block")
    }

    fun doSomethingInParent() {
        println("Do Something in Parent")
    }
}

class Child(value: Int) : Parent(value) {

    init {
        println("Child Primary Constructor Block")
    }

    fun doSomethingInChild() {
        println("Do Something in Child")
    }

}