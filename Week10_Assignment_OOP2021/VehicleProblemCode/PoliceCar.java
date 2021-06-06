package com.buatkode.learnjava.vechileAssignment;

public class PoliceCar implements isEmergency, LandVehicle {
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    private int numWheels;
    private boolean isOnDuty;

    public PoliceCar(){}

    public PoliceCar(String name, int maxPassengers, int maxSpeed, int numWheels, boolean isOnDuty) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
        this.isOnDuty = isOnDuty;
    }

    @Override
    public void soundSiren() {
        System.out.println("NINUNINUNINU!!");
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

    public void setOnDuty(boolean onDuty) {
        isOnDuty = onDuty;
    }

    public boolean isOnDuty() {
        return isOnDuty;
    }

    public String changeDutyStatus() {
        if(isOnDuty()) {
            return "Occupied";
        }
        else
        {
            return "Available";
        }
    }

    public void checkOnDuty() {
        if (isOnDuty()) {
            soundSiren();
        }
        else
        {
            System.out.println("Police is not on duty!");
        }
    }

    public String toString() {
        return "Police car: {" +
                "Name: " + getName() +
                ", Max Passengers: " + getMaxPassengers() +
                ", Max Speed: " + getMaxSpeed() +
                ", Number of Wheels: " + getNumWheels() +
                ", Status: " + changeDutyStatus() + "}";
    }
}
