package com.company;

public class Job {
    private int j, pj, dj;

    public Job(int job, int bearbeitungsZeit, int gewuenschterFertigstellungstermin){
        setJ(job);
        setPj(bearbeitungsZeit);
        setDj(gewuenschterFertigstellungstermin);
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setPj(int pj) {
        this.pj = pj;
    }

    public void setDj(int dj) {
        this.dj = dj;
    }

    public int getDj() {
        return dj;
    }

    public int getJ() {
        return j;
    }

    public int getPj() {
        return pj;
    }
}