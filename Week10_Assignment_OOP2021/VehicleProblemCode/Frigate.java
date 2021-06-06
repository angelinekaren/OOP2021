package com.buatkode.learnjava.vechileAssignment;

public class Frigate implements SeaVehicle {
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    private int displacement;

    public Frigate(){}

    public Frigate(String name, int maxPassengers, int maxSpeed, int displacement) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("I'm launching!");
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void fireGun() {
        System.out.println("Firing gun!!");
    }


    public String toString() {
        return "Frigate: {" +
                "Name: " + getName() +
                ", Max Passengers: " + getMaxPassengers() +
                ", Max Speed: " + getMaxSpeed() +
                ", Displacement: " + getDisplacement() + "}";
    }
}
