package com.company;

public class FirstFit {

    public FirstFit(){

    }

    public void sort(Job[] job){
        int tempCj;

        for(int i = 1; i< job.length; i++){
            Job[] tempJob = job;
            tempJob[i-1] = job[i];
            tempJob[i] = job[i-1];
        }

    }
}
