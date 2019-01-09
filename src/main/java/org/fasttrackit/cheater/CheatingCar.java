package org.fasttrackit.cheater;

import org.fasttrackit.AutoVehicle;
import org.fasttrackit.Vehicle;

public class CheatingCar extends Vehicle {


    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " accelerated with" + speed + " km/h for" +
                durationInHours + " hours");

        double distance = 2 * speed * durationInHours;
        System.out.println("traveled distance" + distance);
        return distance;
    }
        //covariant return type

        public AutoVehicle returnSomeVehicle () {
            return new AutoVehicle();
        }
        //method used to demonstrate type casting
    public void testMethod () {
        System.out.println("Test");
    }
       // CheatingCar.testMethod();

}


