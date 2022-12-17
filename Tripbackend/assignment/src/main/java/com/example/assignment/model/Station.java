package com.example.assignment.model;

import javax.persistence.*;

@Entity
@Table
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long StationID;
    String StationName;

    public Station (){}
    public Station (String stationName)
    {
        StationName=stationName;
    }

    public long getStationID() {
        return StationID;
    }

    public void setStationID(long stationID) {
        StationID = stationID;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }













}
