package com.MirkoCordes.OOP;

public abstract class Ticket {
    private int preis;  // Der Preis
    private boolean entwertet;  // Ungültig, wenn entwertet!

    public Ticket( int preis ) {
        this.preis = preis;
        entwertet = false;
    }

    public int getPreis() { return preis; }
    public void entwerten() { entwertet = true; }
    public boolean istEntwertet() { return entwertet; }
    public abstract boolean gueltigInZone( int zone );
}
