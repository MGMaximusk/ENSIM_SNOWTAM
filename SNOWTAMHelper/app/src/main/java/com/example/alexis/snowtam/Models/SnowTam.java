package com.example.alexis.snowtam.Models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by Mactrasher on 23/11/2016.
 */

public class SnowTam implements Parcelable {

    private String  a_airportCode = "";
    private Date    b_date;
    private String  c_trackID = "";
    private Integer d_lengthDeb = 0;
    private Integer e_widthDeb = 0;     // peut-etre de R ou L
    private String  f_trakCond = "";
    private Integer g_thickness = 0;
    private Integer h_breakCoef = 0;    // Peut-être estimé ou calculé
    private Integer j_snowBand = 0;     // Suivi de L, R ou LR
    private String  k_trackLights = ""; // Suivi de L, R ou LR
    private Date    m_endDeblay;
    private String  n_circulTracks = "";
    private String  p_snowBandCirc = "";
    private String  r_airTraffic = "";
    private Date    s_newObservation;
    private String  t_notes = "";

    public SnowTam() {super();}

    /**
     *
     * Parcelable Interface
     *
     */

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.a_airportCode);
        dest.writeLong(this.b_date != null ? this.b_date.getTime() : -1);
        dest.writeString(this.c_trackID);
        dest.writeValue(this.d_lengthDeb);
        dest.writeValue(this.e_widthDeb);
        dest.writeString(this.f_trakCond);
        dest.writeValue(this.g_thickness);
        dest.writeValue(this.h_breakCoef);
        dest.writeValue(this.j_snowBand);
        dest.writeString(this.k_trackLights);
        dest.writeLong(this.m_endDeblay != null ? this.m_endDeblay.getTime() : -1);
        dest.writeString(this.n_circulTracks);
        dest.writeString(this.p_snowBandCirc);
        dest.writeString(this.r_airTraffic);
        dest.writeLong(this.s_newObservation != null ? this.s_newObservation.getTime() : -1);
        dest.writeString(this.t_notes);
    }


    public SnowTam(Parcel in) {
        this.a_airportCode = in.readString();
        long tmpB_date = in.readLong();
        this.b_date = tmpB_date == -1 ? null : new Date(tmpB_date);
        this.c_trackID = in.readString();
        this.d_lengthDeb = (Integer) in.readValue(Integer.class.getClassLoader());
        this.e_widthDeb = (Integer) in.readValue(Integer.class.getClassLoader());
        this.f_trakCond = in.readString();
        this.g_thickness = (Integer) in.readValue(Integer.class.getClassLoader());
        this.h_breakCoef = (Integer) in.readValue(Integer.class.getClassLoader());
        this.j_snowBand = (Integer) in.readValue(Integer.class.getClassLoader());
        this.k_trackLights = in.readString();
        long tmpM_endDeblay = in.readLong();
        this.m_endDeblay = tmpM_endDeblay == -1 ? null : new Date(tmpM_endDeblay);
        this.n_circulTracks = in.readString();
        this.p_snowBandCirc = in.readString();
        this.r_airTraffic = in.readString();
        long tmpS_newObservation = in.readLong();
        this.s_newObservation = tmpS_newObservation == -1 ? null : new Date(tmpS_newObservation);
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


    /**
     *
     * Getters & Setters
     *
     */

    public String getA_airportCode() {
        return a_airportCode;
    }

    public void setA_airportCode(String a_airportCode) {
        this.a_airportCode = a_airportCode;
    }

    public Date getB_date() {
        return b_date;
    }

    public void setB_date(Date b_date) {
        this.b_date = b_date;
    }

    public String getC_trackID() {
        return c_trackID;
    }

    public void setC_trackID(String c_trackID) {
        this.c_trackID = c_trackID;
    }

    public Integer getD_lengthDeb() {
        return d_lengthDeb;
    }

    public void setD_lengthDeb(Integer d_lengthDeb) {
        this.d_lengthDeb = d_lengthDeb;
    }

    public Integer getE_widthDeb() {
        return e_widthDeb;
    }

    public void setE_widthDeb(Integer e_widthDeb) {
        this.e_widthDeb = e_widthDeb;
    }

    public String getF_trakCond() {
        return f_trakCond;
    }

    public void setF_trakCond(String f_trakCond) {
        this.f_trakCond = f_trakCond;
    }

    public Integer getG_thickness() {
        return g_thickness;
    }

    public void setG_thickness(Integer g_thickness) {
        this.g_thickness = g_thickness;
    }

    public Integer getH_breakCoef() {
        return h_breakCoef;
    }

    public void setH_breakCoef(Integer h_breakCoef) {
        this.h_breakCoef = h_breakCoef;
    }

    public Integer getJ_snowBand() {
        return j_snowBand;
    }

    public void setJ_snowBand(Integer j_snowBand) {
        this.j_snowBand = j_snowBand;
    }

    public String getK_trackLights() {
        return k_trackLights;
    }

    public void setK_trackLights(String k_trackLights) {
        this.k_trackLights = k_trackLights;
    }

    public Integer getL_len_wid() {
        return l_len_wid;
    }

    public void setL_len_wid(Integer l_len_wid) {
        this.l_len_wid = l_len_wid;
    }

    public Date getM_endDeblay() {
        return m_endDeblay;
    }

    public void setM_endDeblay(Date m_endDeblay) {
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

    public Date getS_newObservation() {
        return s_newObservation;
    }

    public void setS_newObservation(Date s_newObservation) {
        this.s_newObservation = s_newObservation;
    }

    public String getT_notes() {
        return t_notes;
    }

    public void setT_notes(String t_notes) {
        this.t_notes = t_notes;
    }
}
