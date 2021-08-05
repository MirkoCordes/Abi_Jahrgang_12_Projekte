package com.company;

public class Maschine {
    private int umrüstzeit;
    private int bearbeitung;
    private String vorgaenger1;
    private String vorgaenger2;
    boolean arbeitet = false;
    boolean zweiMaschinen;

    public Maschine(int umrüstzeit, int bearbeitung, String vorgaenger1, String vorgaenger2, boolean zweiMaschinen){
        setUmrüstzeit(umrüstzeit);
        setBearbeitung(bearbeitung);
        setVorgaenger1(vorgaenger1);
        setVorgaenger2(vorgaenger2);
        setZweiMaschinen(zweiMaschinen);
    }

    public void setUmrüstzeit(int umrüstzeit) {
        this.umrüstzeit = umrüstzeit;
    }

    public void setBearbeitung(int bearbeitung) {
        this.bearbeitung = bearbeitung;
    }

    public void setVorgaenger1(String vorgaenger1) {
        this.vorgaenger1 = vorgaenger1;
    }

    public void setVorgaenger2(String vorgaenger2) {
        this.vorgaenger2 = vorgaenger2;
    }

    public void setArbeitet(boolean arbeitet) {
        this.arbeitet = arbeitet;
        //TODO: TIMER
        this.arbeitet = false;
    }

    public boolean getArbeitet(){
        return this.arbeitet;
    }

    public String getVorgaenger1() {
        return vorgaenger1;
    }

    public String getVorgaenger2() {
        return vorgaenger2;
    }

    public boolean isZweiMaschinen() {
        return zweiMaschinen;
    }

    public void setZweiMaschinen(boolean zweiMaschinen) {
        this.zweiMaschinen = zweiMaschinen;
    }
}
