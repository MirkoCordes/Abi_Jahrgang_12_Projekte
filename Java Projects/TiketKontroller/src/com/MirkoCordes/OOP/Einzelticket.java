package com.MirkoCordes.OOP;

public class Einzelticket extends Ticket {
    private int zone;  // Nur in dieser Zone gültig!
    private String verfallsDatum;  // String im Format JJJJMMTT
    // Nach diesem Datum ungültig!

    public Einzelticket(int preis, String verfallsDatum, int zone) {
        super(preis);
        this.verfallsDatum = verfallsDatum;
        this.zone = zone;
    }

    public String getVerfallsDatum() { return verfallsDatum; }
    public boolean gueltigInZone(int zone) { return zone == this.zone; }
}