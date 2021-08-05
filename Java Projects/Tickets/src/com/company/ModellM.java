package com.company;
/*
 *   -Farbe (int) = 1 - 30
 *   -Speicher (int) = 32 / 64 / 128
 *   -Kamera (int) = 1 / 2 / 3
 *   -SimKarte (int) = 1 / 2
 *   -SdKarte (boolean) = ja / nein
 */
public class ModellM extends Handy {
    public ModellM(int color, int space, int camera, int simCard, int sdCard){
        super(color, space, camera, simCard, sdCard);
    }
}
