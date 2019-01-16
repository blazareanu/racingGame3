package org.fasttrackit;

public class Vehicle {

    public static int applicationTotalNumberOfVehicles;

    private String name;
    private String color;
    private double mileage;
    private long totalKm;
    private double fuelLevel = 70;

    //overloading
    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " accelerated with" + speed + " km/h for" +
                durationInHours + " hours");


        double distance = speed * durationInHours;
        System.out.println("traveled distance" + distance);


        double spentFuel = distance * mileage / 100;

        //1st method

        //double remainingFuel = fuelLevel- spentFuel;
        //fuelLevel =fuelLevel - spentFuel;

        //2nd method

        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel " + fuelLevel);

        totalKm += distance;
        System.out.println("Total traveled distance " + totalKm);

        return distance;
    }

// method used just to demonstrate covaruant return type

    public Vehicle returnSomeVehicle() {
        return this;
    }


    public double accelerate(double speed) {
        return accelerate(speed, 1);

    }

    //overloading


    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public long getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(long totalKm) {
        this.totalKm = totalKm;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }


    //curs 6
// sa nu uit sa generez getteri si setteri pentru noile variabile


}
