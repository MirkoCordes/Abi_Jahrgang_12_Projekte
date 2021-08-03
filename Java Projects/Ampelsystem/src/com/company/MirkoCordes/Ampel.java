package com.company.MirkoCordes;

public class Ampel {
    boolean gruen, gelb, rot;
    int position;

    public Ampel(int position){
        this.position = position;
    }

    public void ampelAufGruen(){
        if(rot){
            gelb=true;
            try {
                wait(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            rot = false;
            gelb = false;
            gruen = true;
        }
    }
}
