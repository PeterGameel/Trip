package com.example.assignment.Service;

import com.example.assignment.model.Station;
import com.example.assignment.model.Trip;
import com.example.assignment.repo.StationRepo;
import com.example.assignment.repo.TripRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StationService {

    private final StationRepo stationRepo;
    @Autowired
    public StationService(StationRepo stationRepo) {
        this.stationRepo=stationRepo;
    }

    public void addStations(Station station){

        stationRepo.save(station);
    }
    public List<Station> listOfStations() {
        return stationRepo.findAll();

    }
    public String updateStation(Station station,long StationID)
    {
        Optional<Station> station_x=stationRepo.findById(StationID);
        station_x.get().setStationName(station.getStationName());
        stationRepo.save(station_x.get());
        return "Station Updated";
    }
    public String RemoveStation (long StationID){
        stationRepo.deleteById(StationID);
        return "Station is removed";
    }







}
