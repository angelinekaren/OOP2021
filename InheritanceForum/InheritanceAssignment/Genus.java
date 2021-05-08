package com.buatkode.learnjava.InheritanceAssignment;

// Question Set 2 (e)
public class Genus {
    private String g;

    // Constructor
    public Genus(String g) {
        this.g = g;
    }

    // Accessor method
    public String getGenusName() {
        return g;
    }

    // toString() method
    @Override
    public String toString() {
        return "Genus Name: " + g;
    }
}
