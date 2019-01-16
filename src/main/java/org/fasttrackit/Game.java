package org.fasttrackit;

public class Game {
    private Track[] tracks = new Track[10];

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