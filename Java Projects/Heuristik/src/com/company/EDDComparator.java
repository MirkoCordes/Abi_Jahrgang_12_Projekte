package com.company;

import java.util.Comparator;

public class EDDComparator implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {

        return o1.getDj() - o2.getDj();
    }
}
