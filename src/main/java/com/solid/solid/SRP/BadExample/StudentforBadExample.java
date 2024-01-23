package com.solid.solid.SRP.BadExample;

public class StudentforBadExample {

    public void printDetails() {
        //functionality of the method
    }


    void calculatePercentage() {
        //functionality of the method
    }

    public void addStudent() {
        //functionality of the method
    }

    /*
    << The single responsibility principle states that every Java class must perform a single functionality. >>
    In this class, there are many methods that are not associated.
    So, We must separate these methods as new classes.
    Every method or class whatever must perform a single functionality.
    */
}
