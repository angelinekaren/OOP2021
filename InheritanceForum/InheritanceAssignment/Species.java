package com.buatkode.learnjava.InheritanceAssignment;

import java.util.Iterator;
import java.util.LinkedList;

public class Species extends Genus {
    private String speciesName;

    public Species(String s, String g) {
        super(g);
        setSpeciesName(s);
    }

    public void setSpeciesName(String s) {
        speciesName = s;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String toString() {
        return "Species: " + getGenusName() + " " + speciesName;
    }

    public boolean equals(Species s) {
        return speciesName.equals(s.getSpeciesName());
    }

    // Question Set 3 (b)
    public static int countSpecimens(Specimen[] animals, Species s) {
        int count = 0;
        for (Specimen x: animals) {
            if (x.getTOA().getSpeciesName().equals(s.getSpeciesName())) {
                count++;
            }
        }
        return count;
    }

    // Question Set 4 (c)
    public static LinkedList<Species> makeSpeciesList(LinkedList<Specimen> animals) {
        LinkedList<Species> speciesList = new LinkedList<Species>();
        for (Specimen animal: animals) {
            speciesList.add(animal.getTOA());
        }
        return speciesList;
    }

    // Question Set 4 (d)
    public static LinkedList<Species> makeSpeciesListUnique(LinkedList<Species> allSpecies) {
        LinkedList<Species> speciesListUnique = new LinkedList<Species>();
        for (Species species: allSpecies) {
            if (!speciesListUnique.contains(species)) {
                speciesListUnique.add(species);
            }
        }
        return speciesListUnique;
    }
}
