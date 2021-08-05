package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class JobManager {
    private Job[] jobs;

    public JobManager(Job[] jobs) {
        this.jobs = jobs;
    }

    public Job[] sortSPT(Job[] jobs){
        Arrays.sort(jobs, new SPTComparator());
        calcCj(jobs);
        calcTT(jobs);
        return jobs;
    }

    public Job[] sortEDD(Job[] jobs){
        Arrays.sort(jobs, new EDDComparator());
        calcCj(jobs);
        calcTT(jobs);
        return jobs;
    }

    public void calcCj(Job[] jobs){
        int ct = 0;
        for(int i=0; i<jobs.length; i++){
            ct+= jobs[i].getPj();
            jobs[i].setCj(ct);
        }

    }

    public int calcTT(Job[] jobs){
        //kommt noch
        for(int i=0; i<jobs.length; i++)
        jobs[i].setTt(Math.max(jobs[i].getCj() - jobs[i].getDj(), 0));
        return 0;
    }
}
