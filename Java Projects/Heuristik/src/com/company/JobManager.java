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
        return jobs;
    }

    public Job[] sortEDD(Job[] jobs){
        Arrays.sort(jobs, new EDDComparator());
        return jobs;
    }

    public void clacCj(Job[] jobs){
        int ct = 0;
        for(int i=0; i<jobs.length; i++){
            ct+= jobs[i].getPj();
            jobs[i].setCj(ct);
        }

    }

    public int calcTT(Job[] jobs){
        int tj =0;
        for(int i=0; i< jobs.length; i++){
            //tj += Math.max(job.getCj() - job.getDj(), 0);
            if(jobs[i].getCj() - jobs[i].getDj() > 0){
                tj += jobs[i].getCj() - jobs[i].getDj();
            }
        }
        return tj;
    }

    public Job[] firstFit(Job[] listOfJobs){
        int firstTT = this.calcTT(listOfJobs);
        for(int i = 1; i < listOfJobs.length; i++) {
            Job[] tempListOfJobs = listOfJobs.clone();
            tempListOfJobs[i - 1] = listOfJobs[i];
            tempListOfJobs[i] = listOfJobs[i - 1];
            if(this.calcTT(tempListOfJobs) < firstTT) {
                return tempListOfJobs;
            }
        }
        return listOfJobs;
    }

    public Job[] bestFit(Job[] listOfJobs) {
        int lastBestFitTT = this.calcTT(listOfJobs);
        Job[] lastBestFitListOfJobs = listOfJobs.clone();
        for(int i = 1; i < listOfJobs.length; i++) {
            Job[] tempListOfJobs = listOfJobs.clone();
            tempListOfJobs[i - 1] = listOfJobs[i];
            tempListOfJobs[i] = listOfJobs[i - 1];
            if(this.calcTT(tempListOfJobs) < lastBestFitTT) {
                lastBestFitTT = this.calcTT(tempListOfJobs);
                lastBestFitListOfJobs = tempListOfJobs.clone();
            }
        }
        return lastBestFitListOfJobs;
    }
}
