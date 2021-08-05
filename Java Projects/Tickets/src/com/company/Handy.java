package com.company;

public class Handy {
    private int farbe;
    private int speicher;
    private int kamera;
    private int simKarte;
    private int sdKarte;

    public Handy(int color, int space, int camera, int simCard, int sdCard){
        setFarbe(color);
        setSpeicher(space);
        setKamera(camera);
        setSimKarte(simCard);
        setSdKarte(sdCard);
    }

    public void setFarbe(int color) {
        this.farbe = color;
    }

    public void setSpeicher(int space) {
        this.speicher = space;
    }

    public void setKamera(int camera) {
        this.kamera = camera;
    }

    public void setSimKarte(int sim) {
        this.simKarte = sim;
    }

    public void setSdKarte(int sd) {
        this.sdKarte = sd;
    }


    public int getFarbe() {
        return farbe;
    }

    public int getSpeicher() {
        return speicher;
    }

    public int getKamera() {
        return kamera;
    }

    public int getSimKarte() {
        return simKarte;
    }

    public int getSdKarte(){
        return sdKarte;
    }
}
