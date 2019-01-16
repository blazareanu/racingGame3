package org.fasttrackit;

import org.fasttrackit.cheater.CheatingCar;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {


        //folosire modulo

        System.out.println(4%2);

        Vehicle cheatingCar = new CheatingCar();

        cheatingCar.accelerate (10,2);

        ((CheatingCar)cheatingCar).testMethod();


        //declaring a variable and instantiating a Car object;
        //this is also called initialising a variable;

//      Car firstCompetitor = new Car (new Engine());
//      firstCompetitor.setName("Dacia");
//      firstCompetitor.setColor("black");
//      firstCompetitor.setMileage(9.5);
//      firstCompetitor.setTotalKm(55);
//      firstCompetitor.doorCount = 5;
//
//
//
//    // local variables are variables declared inside a method;
//        // they don't receive default values;
//
//        Car secondCompetitor = new Car(new Engine());
//        secondCompetitor.setName("Golf");

//polymorphism- an object can takem ultiple forms




//
//
//  Engine firstEngine = new Engine ();
//  firstEngine.manufacturer= "Renault";
//
//  //sout prints and message to the console;
//
//        System.out.println(firstEngine.manufacturer);
//    firstCompetitor.engine = firstEngine;
//
//firstCompetitor.engine.manufacturer ="BMW";
//
//        System.out.println(firstEngine.manufacturer);
//        System.out.println(firstCompetitor.engine.manufacturer);
//
//        double traveledDistance =
//                firstCompetitor.accelerate(100, 30);
//
//        System.out.println("traveled distance " + traveledDistance);
//


        Vehicle vehicle = new Vehicle();
        Vehicle.applicationTotalNumberOfVehicles = 1;
        System.out.println("total from vehicle 1 " + vehicle.applicationTotalNumberOfVehicles);

        Vehicle vehicle2 = new Vehicle();
        Vehicle.applicationTotalNumberOfVehicles = 2;
        System.out.println("total from vehicle 2 " + vehicle2.applicationTotalNumberOfVehicles);

        System.out.println("total from vehicle 2 " + vehicle.applicationTotalNumberOfVehicles);
        System.out.println("total from vehicle 2 " + vehicle2.applicationTotalNumberOfVehicles);


        //este output-ul pentru Cheating Car


        CheatingCar cheatingCompetitor = new CheatingCar();
        cheatingCompetitor.setName("Test 1");
        double distance = cheatingCompetitor.accelerate(70);
        System.out.println("Cheating parcurge distanta de " + distance);



    }
}
