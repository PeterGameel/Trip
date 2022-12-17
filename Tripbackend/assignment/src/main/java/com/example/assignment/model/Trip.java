package com.example.assignment.model;

import javax.persistence.*;

@Entity
@Table
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long TripID;
    String StartTime;
    String EndTime;
    String FromStation;
    String ToStation;

    public Trip() {}

    public Trip (String s_time, String e_time,String f_station, String t_station){

        StartTime = s_time;
        EndTime =e_time;
        FromStation=f_station;
        ToStation=t_station;

    }
    public long getTripID() {
        return TripID;
    }

    public void setTripID(long tripID) {
        TripID = tripID;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String s_time) {
        StartTime = s_time;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String e_time) {
        EndTime = e_time;
    }

    public String getFromStation() {
        return FromStation;
    }

    public void setFromStation(String f_station) {
        FromStation = f_station;
    }

    public String getToStation() {
        return ToStation;
    }

    public void setToStation(String t_station) {
        ToStation = t_station;
    }










}
