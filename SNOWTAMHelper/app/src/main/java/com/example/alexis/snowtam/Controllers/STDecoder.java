package com.example.alexis.snowtam.Controllers;

import com.example.alexis.snowtam.Models.SnowTam;

/**
 * Created by Mactrasher on 24/11/2016.
 */

public class STDecoder {

    public SnowTam decode(String rawSnowTam){
        String[] lines = rawSnowTam.split("\n");
        SnowTam decoded = new SnowTam();

        for(String line : lines) {

            if (Character.toString(line.charAt(0)).equals("A")) {
                decoded.setA_airportCode(line.split("\\)\\s")[1].trim());
            }

            else if (Character.toString(line.charAt(0)).equals("B")) {

            }

            else if (Character.toString(line.charAt(0)).equals("C")) {
                decoded.setC_trackID(line.split(") ")[1].trim());
            }

            else if (Character.toString(line.charAt(0)).equals("D")) {
                // TODO
            }

            else if (Character.toString(line.charAt(0)).equals("E")){
                // TODO
            }

            else if (Character.toString(line.charAt(0)).equals("F"))
                decoded.setF_trakCond(line.split(") ")[1].trim());

            else if (Character.toString(line.charAt(0)).equals("G")){
                // TODO
            }

            else if (Character.toString(line.charAt(0)).equals("H")) {
                // TODO
            }

            else if (Character.toString(line.charAt(0)).equals("E")) {
                // TODO
            }

            else if (Character.toString(line.charAt(0)).equals("K"))
                decoded.setK_trackLights(line.split(") ")[1].trim());


            else if (Character.toString(line.charAt(0)).equals("L"))
            // TODO


            else if (Character.toString(line.charAt(0)).equals("M"))
            // TODO

            else if (Character.toString(line.charAt(0)).equals("N"))
                decoded.setN_circulTracks(line.split(") ")[1].trim());

            else if (Character.toString(line.charAt(0)).equals("P"))
                decoded.setP_snowBandCirc(line.split(") ")[1].trim());

            else if (Character.toString(line.charAt(0)).equals("R"))
                decoded.setR_airTraffic(line.split(") ")[1].trim());

            else if (Character.toString(line.charAt(0)).equals("h"))
            // TODO

            else if (Character.toString(line.charAt(0)).equals("T"))
                decoded.setT_notes(line.split(") ")[1].trim());

        }
        return decoded;
    }
}
