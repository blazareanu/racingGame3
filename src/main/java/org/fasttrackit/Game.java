package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Track[] tracks = new Track[10];

    private List<Vehicle> competitors = new ArrayList<>();

    public void addCompetitor (int competitorCount) {
        for (int i=0; i<competitorCount; i++){
            Vehicle vehicle = new Vehicle();
            //vehicle details will be populated when we  learn to get's users input
            competitors.add(vehicle);

            }
        //enhanced for with lists same as with arrays

       // for (Vehicle vehicle: competitors){
         //   System.out.println(vehicle.getName());
       // }
        }


        public void displayCompetitors () {
            System.out.println(" Welcome! Race is starting with: ");
            for (int i=0; i < competitors.size(); i++) {
                System.out.println(competitors.get(i).getName());

                if (competitors.get(i) != null) {
                    System.out.println(competitors.get(i).getName());
                }
            }}


    public void addTrack(int index, Track track) {
        // ca sa adaug pe prima poz un obiect


        tracks[index] = track;

    }

    public void displayAvailableTracks() {
        System.out.println("Available tracks ");

        // for loop

        //   for (int i = 0; i < tracks.length; i++) {
        //     if (tracks[i] != null) {
        //       System.out.println("Skipping null element ");


        //     System.out.println(tracks[i].getName());


        //daca nu e negatie atunci putem folosi else
        //else if (true){
        //sout ();
        //else {


        //for each - enhanced for loop

        for (Track track : tracks) {
            if (track != null) {
                System.out.println(track.getName());
            }
        }
    }
}