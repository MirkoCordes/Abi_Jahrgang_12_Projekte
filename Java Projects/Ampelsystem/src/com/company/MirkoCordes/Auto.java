package com.company.MirkoCordes;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Timer;

public class Auto {
    private int richtung;   // 1 -> Links | 2 -> Gradeaus | 3 -> Rechts
    private int waiting;

    public Auto(int richtung, int waiting) {
        this.richtung = richtung;
        this.waiting = waiting;
    }

    public int getRichtung() {
        return richtung;
    }

    public void setRichtung(int richtung) {
        this.richtung = richtung;
    }

    public int getWaiting() {
        return waiting;
    }

    public void setWaiting(int waiting) {
        this.waiting = waiting;
    }
}
