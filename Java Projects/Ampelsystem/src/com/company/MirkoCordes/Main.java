package com.company.MirkoCordes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Auto[] autos1 = new Auto[5];
        Auto[] autos2 = new Auto[5];
        Auto[] autos3 = new Auto[5];
        Auto[] autos4 = new Auto[5];
        Ampel[] ampels = new Ampel[4];

        ArrayList<Auto> autos = new ArrayList<Auto>();
        autos.add

        for(int i=0; i<=5; i++){
            autos1[i] = new Auto(i);
            autos2[i] = new Auto(i);
            autos3[i] = new Auto(i);
            autos4[i] = new Auto(i);
        }

        for (int i= 0; i<5; i++){
            ampels[i] = new Ampel(i);
        }




    }
}
