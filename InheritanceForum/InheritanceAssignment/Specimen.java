package com.buatkode.learnjava.InheritanceAssignment;

import java.util.Arrays;
import java.util.LinkedList;

public class Specimen {
    private String name;
    private int cageNumber;
    private Species toa; // Type of Animal

    public Specimen(String a, int c, Species s) {
        setName(a);
        setCage(c);
        setTOA(s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCage() {
        return cageNumber;
    }

    public void setCage(int cageNumber) {
        this.cageNumber = cageNumber;
    }

    public Species getTOA() {
        return toa;
    }

    public void setTOA(Species toa) {
        this.toa = toa;
    }

    // Question Set 4 (b)
    public static LinkedList<Specimen> makeList(Specimen[] animals) {
        return new LinkedList<Specimen>(Arrays.asList(animals));
    }
}
