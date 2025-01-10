package com.example.myapplication.classes;

public class MyJavaClass {

     int acceptValue;

    public MyJavaClass(int someValue) {
        acceptValue = someValue;
    }

    private int returnAcceptedValue() {
        return acceptValue;
    }
}

class initilize {

    MyJavaClass myJavaClass = new MyJavaClass(23);
    int someValue = myJavaClass.acceptValue;
}


