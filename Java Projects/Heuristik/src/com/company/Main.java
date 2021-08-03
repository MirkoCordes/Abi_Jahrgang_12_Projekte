package com.company;

public class Main {
    JobManager jobManager;
    public static void main(String[] args) {
	// write your code here
        int[] pj = {4,3,2,3,5,6};
        int[] dj = {11,9,7,20,10,5};
        Job[] jobs = new Job[6];

        for(int i= 0; i<pj.length; i++){
            jobs[i] = new Job(i++, pj[i], dj[i]);
        }

        JobManager jobmanager = new JobManager(jobs);

        System.out.println(jobmanager.calcTT(jobs));
        jobmanager.sortEDD(jobs);
        System.out.println(jobmanager.calcTT(jobs));
        jobmanager.sortSPT(jobs);
        System.out.println(jobmanager.calcTT(jobs));
        jobmanager.firstFit(jobs);
        System.out.println(jobmanager.calcTT(jobs));
        jobmanager.bestFit(jobs);
        System.out.println(jobmanager.calcTT(jobs));
    }
}
