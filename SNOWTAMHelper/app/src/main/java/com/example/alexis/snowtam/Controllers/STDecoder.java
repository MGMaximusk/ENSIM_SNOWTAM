package com.example.alexis.snowtam.Controllers;

import com.example.alexis.snowtam.Models.SnowTam;

/**
 * Created by Mactrasher on 17/11/2016.
 */

public class STDecoder {

    public SnowTam decode(String rawSnowTam){
        String[] lines = rawSnowTam.split("\n");
        SnowTam decoded = new SnowTam();

        for(String line : lines)
            switch (line[0]){
                case "A":
                    decoded.setA_airportcode(line.split(") ")[1].trim());
                    break;
                case "B":
                    decoded.setB_date(line.split(") ")[1].trim());
                    break;
                case "C":
                    decoded.setC_trackID(line.split(") ")[1].trim());
                    break;
                case "D": // a refaire
                    break;
                case "E": // a refaire
                    break;
                case "F":
                    decoded.setF_trakCond(line.split(") ")[1].trim());
                    break;
                case "G":
                    decoded.setG_thickness(line.split(") ")[1].trim());
                    break;
                case "H": // a refaire
                    break;
                case "J": // a refaire
                    break;
                case "K":
                    decoded.setK_trackLights(line.split(") ")[1].trim());
                    break;
                case "L": // a refaire au cas ou
                    decoded.setL_len_wid(line.split(") ")[1].trim());
                    break;
                case "M": // a refaire !!! date
                    break;
                case "N":
                    decoded.setN_circulTracks(line.split(") ")[1].trim());
                    break;
                case "P":
                    decoded.setP_snwoBandCirc(line.split(") ")[1].trim());
                    break;
                case "R":
                    decoded.setR_airTraffic(line.split(") ")[1].trim());
                    break;
                case "S": // a refaire !!! date
                    break;
                case "T":
                    decoded.setT_notes(line.split(") ")[1].trim());
                    break;
            }
        return decoded;
    }

    

}
