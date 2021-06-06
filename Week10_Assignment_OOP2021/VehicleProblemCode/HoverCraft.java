package com.buatkode.learnjava.vechileAssignment;

public class HoverCraft implements LandVehicle, SeaVehicle {
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    private int numWheels;
    private int displacement;
    private boolean isOnLand;

    public HoverCraft(){}

    public HoverCraft(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement, boolean isOnLand) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
        this.displacement = displacement;
        this.isOnLand = isOnLand;
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

    public void enterLand() {
        System.out.println("Entering land!");
    }

    public void enterSea() {
        System.out.println("Entering sea!");
    }

    public void setOnLand(boolean onLand) {
        isOnLand = onLand;
    }

    public boolean isOnLand() {
        return true;
    }

    public void checkSurface() {
        if(isOnLand) {
            enterLand();
        }
        else{
            enterSea();
        }
    }

    public String stringCheckSurface(){
        if(isOnLand) {
            return "on Land";
        }
        else{
            return "on Sea";
        }
    }

    public String toString() {
        return "HoverCraft: {" +
                "Name: " + getName() +
                ", Max Passengers: " + getMaxPassengers() +
                ", Max Speed: " + getMaxSpeed() +
                ", Number of Wheels: " + getNumWheels() +
                ", Displacement: " + getDisplacement() +
                ", Surface: " + stringCheckSurface() + "}";
    }

}
