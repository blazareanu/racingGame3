package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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


Vehicle vehicle = new Vehicle ();
Vehicle.applicationTotalNumberOfVehicles = 1;
        System.out.println("total from vehicle 1 " + vehicle.applicationTotalNumberOfVehicles);

        Vehicle vehicle2 = new Vehicle ();
        Vehicle.applicationTotalNumberOfVehicles = 2;
        System.out.println("total from vehicle 2 " + vehicle2.applicationTotalNumberOfVehicles);

        System.out.println("total from vehicle 2 " + vehicle.applicationTotalNumberOfVehicles);
        System.out.println("total from vehicle 2 " + vehicle2.applicationTotalNumberOfVehicles);
    }

}
