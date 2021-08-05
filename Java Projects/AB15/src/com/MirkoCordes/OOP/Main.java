package com.MirkoCordes.OOP;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        AgeControl ageControl = new AgeControl();
        try {
            System.out.print("Ihr Alter: ");
            a = scanner.nextInt();
            AgeControl.adult(a);
        } catch(SecurityException e) {
            System.err.println(e);
        }
    }
}
