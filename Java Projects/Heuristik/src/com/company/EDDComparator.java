package com.company;

import java.util.Comparator;

public class EDDComparator implements Comparator<Job> {

    @Override
    public int compare(Job job1, Job job2) {
        return job1.getDj() - job2.getDj();
    }
}
