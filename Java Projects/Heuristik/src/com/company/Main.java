package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int[] pj = {4,3,2,3,5,6};
        int[] dj = {11,9,7,20,10,5};
        Job[] jobs = new Job[6];

        for(int i= 0; i<pj.length; i++){
            jobs[i] = new Job(i+1, pj[i], dj[i]);
        }

        JobManager jobManager = new JobManager(jobs);

        jobManager.sortSPT(jobs);

        System.out.println("id\t\tpj\t\tdj\t\tcj\t\ttt");
        for(int i=0; i<jobs.length; i++){
            System.out.println(jobs[i].getId() + "\t\t" + jobs[i].getPj() + "\t\t" + jobs[i].getDj() + "\t\t" + jobs[i].getCj() + "\t\t" + jobs[i].getTt());
        }
    }
}
