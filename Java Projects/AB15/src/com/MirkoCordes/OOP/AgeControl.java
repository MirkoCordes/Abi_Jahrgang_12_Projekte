package com.MirkoCordes.OOP;

public class AgeControl {
    AgeControl(){

    }

    static void adult(int age) throws SecurityException{
        if(age<18){
            System.err.println("Sie sind noch nicht volljährig!");
        } else {
            System.out.println("Sie sind: " + age);
        }

    }
}
