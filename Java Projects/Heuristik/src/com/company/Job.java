package com.company;

public class Job {
    private int id, pj, dj, cj, tt;

    public Job(int id, int pj, int dj){
        this.id = id;
        this.pj = pj;
        this.dj = dj;
    }

    public int getId() {
        return id;
    }

    public int getPj() {
        return pj;
    }

    public int getDj() {
        return dj;
    }

    public int getCj() {
        return cj;
    }

    public void setCj(int cj) {
        this.cj = cj;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public int getTt() {
        return tt;
    }
}
