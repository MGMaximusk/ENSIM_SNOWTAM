package com.example.alexis.snowtam.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Mactrasher on 24/11/2016.
 */

public class SnowTam implements Parcelable {

    final String raw = "A) ENVA\n" +
            "B) 10130330 \n" +
            "C) 09\n" +
            "F) NIL/NIL/NIL \n" +
            "H) 5/5/5\n" +
            "N) A1 A2 A3 A4 A5 A6 A8 B1 B2 G C G W Y/NIL\n" +
            "R) APRON EAST APRON NORTH APRON WEST M1 M2 M3/NIL";

    private String  a_airportCode = "";
    private String  b_date = "";
    private String  c_trackID = "";
    private String  d_lengthDeb = "";
    private String  e_widthDeb = "";     // peut-etre de R ou L
    private String  f_trakCond = "";
    private String  g_thickness = "";
    private String  h_breakCoef = "";    // Peut-être estimé ou calculé
    private String  j_snowBand = "";     // Suivi de L, R ou LR
    private String  k_trackLights = ""; // Suivi de L, R ou LR
    private String  m_endDeblay = "";
    private String  n_circulTracks = "";
    private String  p_snowBandCirc = "";
    private String  r_airTraffic = "";
    private String  s_newObservation;
    private String  t_notes = "";


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.a_airportCode);
        dest.writeString(this.b_date);
        dest.writeString(this.c_trackID);
        dest.writeString(this.d_lengthDeb);
        dest.writeString(this.e_widthDeb);
        dest.writeString(this.f_trakCond);
        dest.writeString(this.g_thickness);
        dest.writeString(this.h_breakCoef);
        dest.writeString(this.j_snowBand);
        dest.writeString(this.k_trackLights);
        dest.writeString(this.m_endDeblay);
        dest.writeString(this.n_circulTracks);
        dest.writeString(this.p_snowBandCirc);
        dest.writeString(this.r_airTraffic);
        dest.writeString(this.s_newObservation);
        dest.writeString(this.t_notes);
    }

    public SnowTam() {
    }

    private SnowTam(Parcel in) {
        this.a_airportCode = in.readString();
        this.b_date = in.readString();
        this.c_trackID = in.readString();
        this.d_lengthDeb = in.readString();
        this.e_widthDeb = in.readString();
        this.f_trakCond = in.readString();
        this.g_thickness = in.readString();
        this.h_breakCoef = in.readString();
        this.j_snowBand = in.readString();
        this.k_trackLights = in.readString();
        this.m_endDeblay = in.readString();
        this.n_circulTracks = in.readString();
        this.p_snowBandCirc = in.readString();
        this.r_airTraffic = in.readString();
        this.s_newObservation = in.readString();
        this.t_notes = in.readString();
    }

    public static final Parcelable.Creator<SnowTam> CREATOR = new Parcelable.Creator<SnowTam>() {
        @Override
        public SnowTam createFromParcel(Parcel source) {
            return new SnowTam(source);
        }

        @Override
        public SnowTam[] newArray(int size) {
            return new SnowTam[size];
        }
    };

    public String getA_airportCode() {
        return a_airportCode;
    }

    public void setA_airportCode(String a_airportCode) {
        this.a_airportCode = a_airportCode;
    }

    public String getB_date() {
        return b_date;
    }

    public void setB_date(String b_date) {
        this.b_date = b_date;
    }

    public String getC_trackID() {
        return c_trackID;
    }

    public void setC_trackID(String c_trackID) {
        this.c_trackID = c_trackID;
    }

    public String getD_lengthDeb() {
        return d_lengthDeb;
    }

    public void setD_lengthDeb(String d_lengthDeb) {
        this.d_lengthDeb = d_lengthDeb;
    }

    public String getE_widthDeb() {
        return e_widthDeb;
    }

    public void setE_widthDeb(String e_widthDeb) {
        this.e_widthDeb = e_widthDeb;
    }

    public String getF_trakCond() {
        return f_trakCond;
    }

    public void setF_trakCond(String f_trakCond) {
        this.f_trakCond = f_trakCond;
    }

    public String getG_thickness() {
        return g_thickness;
    }

    public void setG_thickness(String g_thickness) {
        this.g_thickness = g_thickness;
    }

    public String getH_breakCoef() {
        return h_breakCoef;
    }

    public void setH_breakCoef(String h_breakCoef) {
        this.h_breakCoef = h_breakCoef;
    }

    public String getJ_snowBand() {
        return j_snowBand;
    }

    public void setJ_snowBand(String j_snowBand) {
        this.j_snowBand = j_snowBand;
    }

    public String getK_trackLights() {
        return k_trackLights;
    }

    public void setK_trackLights(String k_trackLights) {
        this.k_trackLights = k_trackLights;
    }

    public String getM_endDeblay() {
        return m_endDeblay;
    }

    public void setM_endDeblay(String m_endDeblay) {
        this.m_endDeblay = m_endDeblay;
    }

    public String getN_circulTracks() {
        return n_circulTracks;
    }

    public void setN_circulTracks(String n_circulTracks) {
        this.n_circulTracks = n_circulTracks;
    }

    public String getP_snowBandCirc() {
        return p_snowBandCirc;
    }

    public void setP_snowBandCirc(String p_snowBandCirc) {
        this.p_snowBandCirc = p_snowBandCirc;
    }

    public String getR_airTraffic() {
        return r_airTraffic;
    }

    public void setR_airTraffic(String r_airTraffic) {
        this.r_airTraffic = r_airTraffic;
    }

    public String getS_newObservation() {
        return s_newObservation;
    }

    public void setS_newObservation(String s_newObservation) {
        this.s_newObservation = s_newObservation;
    }

    public String getT_notes() {
        return t_notes;
    }

    public void setT_notes(String t_notes) {
        this.t_notes = t_notes;
    }
}
