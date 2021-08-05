package com.company.MirkoCordes;

public class AmpelPlaner {
    public void schalteAlleRot(Ampel[] ampeln) {
        for (int i = 0; i < ampeln.length; i++){
            ampeln[i].setIsred(true);
        }
    }
    public void schalteEineRot(Ampel[] ampeln, int pos) {
        ampeln[pos].setIsred(true);
    }
    public void schalteEineGruen(Ampel[] ampeln, int pos) {
        schalteAlleRot(ampeln);
        ampeln[pos].setIsred(false);
        for(int i = 0; i < 6; i++) {
            // if als NICHT Kurzschreibweise
            if (ampeln[pos].carswaiting.size() > 0)
                ampeln[pos].carswaiting.remove(0);
            else
                break;
        }
    }
    public void warteAufGruen(Ampel[] ampeln) {
        int i = 0;
        while (true) {
            schalteEineGruen(ampeln, i);
            i++;
            i = i%4;
        }
    }

}
