package com.company;

import java.util.Arrays;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        int[] cj = new int[] {1,1,1,1,1,1};
        Job[] jopTabelle = new Job[]{
                new Job(1, 4, 11),
                new Job(2, 3, 9),
                new Job(3, 2, 7),
                new Job(4, 3, 20),
                new Job(5, 5, 10),
                new Job(6, 6, 5),
        };



        Arrays.sort(jopTabelle, new SortiereNachBearbeitung());

        sortiereAusgeben(jopTabelle);

        Arrays.sort(jopTabelle, new SortiereNachFertigstellung());

        sortiereAusgeben(jopTabelle);
    }

    static void sortiereAusgeben(Job[] jopTabelle){
        for (int i=0; i<6; i++){
            System.out.println(jopTabelle[i].getJ() + ". Pj: " + jopTabelle[i].getPj() + " Dj:" + jopTabelle[i].getDj());
        }

        System.out.println();
    }

    static void richtigerFertigstellungsTermin(Job[] jopTabelle, int[] cj){

        cj[0] = jopTabelle[0].getPj();
        for (int i = 1; i<6; i++){
            cj[i] = jopTabelle[i].getPj() + jopTabelle[i--].getPj();
        }
    }


}
