package com.buatkode.learnjava.vechileAssignment;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Jeep jeep = new Jeep("Honda", 60, 100, 4);
        Frigate frigate = new Frigate("Nilgiri", 200, 300, 50);
        HoverCraft hoverCraft1 = new HoverCraft("Hoverjet GT.", 400, 500, 10, 100, true);
        HoverCraft hoverCraft2 = new HoverCraft("AirLift Hovercraft", 400, 500, 6, 300, false);
        PoliceCar policeCar1 = new PoliceCar("Sedan", 4, 80, 4, true);
        PoliceCar policeCar2 = new PoliceCar("Tesla", 6, 90, 4, false);
        PoliceCar policeCar3 = new PoliceCar("Lexus", 5, 85, 4, false);
        PoliceCar policeCar4 = new PoliceCar("Mazda", 4, 70, 4, true);


        // Jeep
        System.out.println("Jeep: ");
        jeep.drive();
        jeep.soundHorn();
        System.out.println(jeep);

        // Frigate
        System.out.println("Frigate: ");
        frigate.launch();
        frigate.fireGun();
        System.out.println(frigate);

        // HoverCraft
        ArrayList<HoverCraft> hoverCraftList = new ArrayList<>();
        hoverCraftList.add(hoverCraft1);
        hoverCraftList.add(hoverCraft2);

        hoverCraft1.drive();
        hoverCraft1.checkSurface();

        hoverCraft2.drive();
        hoverCraft2.checkSurface();

        for(HoverCraft hoverCraft: hoverCraftList) {
            System.out.println(hoverCraft);
        }

        // Police Car
        ArrayList<PoliceCar> policeCarList = new ArrayList<>();
        policeCarList.add(policeCar1);
        policeCarList.add(policeCar2);
        policeCarList.add(policeCar3);
        policeCarList.add(policeCar4);

        printList(policeCarList);

        System.out.print("Police 1: ");
        policeCar1.checkOnDuty();
        System.out.print("Police 2: ");
        policeCar2.checkOnDuty();
    }

    public static void printList(ArrayList<PoliceCar> ArrayList) {
        int x = 1;
        for (PoliceCar policeCar : ArrayList) {
            System.out.println("Police car No. " + x + ", " + policeCar);
            x++;
        }
    }
}
