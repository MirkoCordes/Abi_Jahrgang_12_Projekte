package com.MirkoCordes.OOP;

public class Generalabo extends Ticket {
    private String inhaber;  // Nur für diese Person gültig!
    private String verfallsDatum;  // String im Format JJJJMMTT
    // Nach diesem Datum ungültig!

    public Generalabo(int preis, String inhaber, String verfallsDatum) {
        super(preis);
        this.inhaber = inhaber;
        this.verfallsDatum = verfallsDatum;
    }

    public void entwerten() { /* es passiert nix! */ }
    public String getVerfallsDatum() { return verfallsDatum; }
    public boolean gueltigInZone( int zone ) { return true; }
    public String gibInhaber() { return inhaber; }
}