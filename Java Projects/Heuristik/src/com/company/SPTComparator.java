package com.company;

import java.util.Comparator;

public class SPTComparator implements Comparator<Job> {

    @Override
    public int compare(Job job1, Job job2) {
        return job1.getPj() - job2.getPj();
    }
}
