package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private Track[] tracks = new Track[10];

    private List<Vehicle> competitors = new ArrayList<>();

    //punem logica jocului in start


    public void start() throws Exception {

        //le-am adus din App fara game.
        addCompetitor(2);
        displayCompetitors();
        addTrack(0, new Track("Highway ", 100));
        addTrack(1, new Track("Seaside ", 200));
        displayAvailableTracks();


        int trackNumber = getTrackNumberFromUser();
        Track track = tracks[trackNumber - 1];
        System.out.println("Chosen track: " + track.getName());
    }

    private int getTrackNumberFromUser() throws Exception {

        System.out.println("Please enter your track preference: ");
        Scanner scanner = new Scanner(System.in);

        // cum am scris initial pana sa pun try- catch method
        // int track = scanner.nextInt();

        //mai corect era dupa Scanner scanner sa scriu


        try {
            //am aruncat exceptia cu un anumit mesaj dar tot da crash

            return scanner.nextInt();
        } catch (InputMismatchException exception) {
            //in cazul in care vreau sa arunc un mesaj ca exceptie, las linia de mai jos
            // throw new Exception("Expected an integer number");

            System.out.println(" Expected an integer number: ");
            return getTrackNumberFromUser();
        }

    }

    // private Track privateTrackFromUser
    //sout
    //Scanner scanner


    public void addCompetitor(int competitorCount) {
        for (int i = 0; i < competitorCount; i++) {
            Vehicle vehicle = new Vehicle();

            String name = getVehicleNameFromUser();
            vehicle.setName(name);

            //sa cream un nr zecimal random

            double mileage = ThreadLocalRandom.current().nextDouble(5, 15);

            vehicle.setMileage(mileage);
            System.out.println("Your mileage is " + mileage);

            //vehicle details will be populated when we  learn to get's users input
            competitors.add(vehicle);

        }

        //enhanced for with lists same as with arrays

        // for (Vehicle vehicle: competitors){
        //   System.out.println(vehicle.getName());
        // }
    }


    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(" Your vehicle name is: " + name);
        return name;

    }

    private double getVehicleAccelerationSpeedUser() {
        System.out.println("Please enter acceleration speed: ");
        Scanner scanner = new Scanner(System.in);
        //  return double accelerationSpeed = scanner.nextDouble();
        return scanner.nextDouble();
        //sau putem sa mai scriem ula fraza ca return scanner.nextDouble();
    }

    public void displayCompetitors() {
        System.out.println(" Welcome! Race is starting with: ");
        for (int i = 0; i < competitors.size(); i++) {
            System.out.println(competitors.get(i).getName());

            if (competitors.get(i) != null) {
                System.out.println(competitors.get(i).getName());
            }
        }
    }

    public void addTrack(int index, Track track) {
        // ca sa adaug pe prima poz un obiect


        tracks[index] = track;
    }

    public void displayAvailableTracks() {
        System.out.println("Available tracks ");

        // clasic for loop

        //   for (int i = 0; i < tracks.length; i++) {
        //     if (tracks[i] != null) {
        //       System.out.println("Skipping null element ");


        //     System.out.println(tracks[i].getName());
        // }
        // }

        //daca nu e negatie atunci putem folosi else
        //else if (true){
        //sout ();
        //else {


        //for each - enhanced for loop

        for (Track track : tracks) {
            if (track != null) {
                System.out.println(track.getName());
            }


            boolean noWinnerYet = true;

            // sa tinem minte nr juc care nu mai au combustibil

            int competitorsWithoutFuel = 0;


            while (noWinnerYet && competitorsWithoutFuel < competitors.size()) {

                for (Vehicle vehicle : competitors) {
                    double speed = getVehicleAccelerationSpeedUser();
                    vehicle.accelerate(speed);
                    if (vehicle.getFuelLevel() <= 0) {
                        competitorsWithoutFuel++;
                    }
                    if (vehicle.getTotalKm() >= track.getLength()) {
                        noWinnerYet = false;
                        System.out.println("The winner is: " + vehicle.getName());
                        break;
                    }
                }
            }
        }
    }
}









