package com.example.assignment.Service;

import com.example.assignment.model.Admin;
import com.example.assignment.model.Trip;
import com.example.assignment.repo.TripRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TripService {
    private final TripRepo tripRepo;
    @Autowired
    public TripService(TripRepo tripRepo) {

        this.tripRepo=tripRepo;
    }

    public void addTrips(Trip trip){

        tripRepo.save(trip);
    }
    public List<Trip> listOfTrips() {
        return tripRepo.findAll();

    }
    public String updateTrips(Trip trip,long TripID)
    {
        Optional<Trip> trip1= tripRepo.findById(TripID);
        trip1.get().setStartTime(trip.getStartTime());
        trip1.get().setEndTime(trip.getEndTime());
        trip1.get().setFromStation(trip.getFromStation());
        trip1.get().setToStation(trip.getToStation());

        tripRepo.save(trip1.get());
        return "Trip Updated";
    }
    public String RemoveTrip (long TripID){
        tripRepo.deleteById(TripID);
        return "Trip is removed";
    }




}
