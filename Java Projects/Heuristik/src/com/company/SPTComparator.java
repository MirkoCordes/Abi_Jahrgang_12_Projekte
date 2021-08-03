package com.company;

import java.util.Comparator;

public class SPTComparator implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return o1.getPj() - o2.getPj();
    }
}
