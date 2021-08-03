package com.company.MirkoCordes;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Timer;

public class Auto {
    boolean darfFahren, binDurch;
    int id, warteZeit;

    public Auto(int id){
        darfFahren = false;
        this.id = id;
    }


    public void setDarfFahren(boolean darfFahren) {
        this.darfFahren = darfFahren;

        if(darfFahren){
            setBinDurch(true);
        }
    }

    public void setBinDurch(boolean binDurch) {
        this.binDurch = binDurch;
    }

    public int getId() {
        return id;
    }

    public boolean isBinDurch() {
        return binDurch;
    }

    public void setWarteZeit(int warteZeit) {
        this.warteZeit = warteZeit;
    }
}
