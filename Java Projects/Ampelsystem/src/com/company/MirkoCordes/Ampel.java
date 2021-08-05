package com.company.MirkoCordes;

import java.util.ArrayList;

public class Ampel {
    private boolean isred;

    ArrayList<Auto> carswaiting = new ArrayList<Auto>(0);
    public Ampel(boolean isred) {
        this.isred = isred;
        initCars();
    }

    public boolean isIsred() {
        return isred;
    }

    public void setIsred(boolean isred) {
        this.isred = isred;
    }

    public void initCars() {
        for (int i = 0; i < 100; i++) {
            carswaiting.add(new Auto(2,2));
        }
    }
}
