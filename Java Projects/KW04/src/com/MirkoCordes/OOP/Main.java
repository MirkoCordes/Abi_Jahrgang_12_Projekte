package com.MirkoCordes.OOP;

public class Main {

    public static void main(String[] args) {
        Superklasse ssprKlasse = new Superklasse(3, 9, 10);
        Subklasse supSup = new Subklasse(10, 11,5);

        System.out.println("ZahlA = " + ssprKlasse.zahlA + " und " + supSup.zahlA);
        System.out.println("ZahlB = " + ssprKlasse.zahlB + " und " + supSup.zahlB);
        //System.out.println("ZahlC = " + ssprKlasse.zahlC + " und " + supSup.zahlC);
    }
}
