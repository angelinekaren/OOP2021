package com.buatkode.learnjava.vechileAssignment;

public class Jeep implements LandVehicle {
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    private int numWheels;

    public Jeep(){}

    public Jeep(String name, int maxPassengers, int maxSpeed, int numWheels) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("I'm driving!!");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
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

    public void soundHorn() {
        System.out.println("Honk honk honk!!");
    }

    public String toString() {
        return "Jeep: {" +
                "Name: " + getName() +
                ", Max Passengers: " + getMaxPassengers() +
                ", Max Speed: " + getMaxSpeed() +
                ", Number of Wheels: " + getNumWheels() + "}";
    }

}
