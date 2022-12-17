package com.example.assignment.Controller;

import com.example.assignment.Service.AdminService;
import com.example.assignment.Service.StationService;
import com.example.assignment.Service.TripService;
import com.example.assignment.model.Admin;
import com.example.assignment.model.Station;
import com.example.assignment.model.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="start")
@CrossOrigin(origins ="*")
public class AdminController {
    private final AdminService adminService;
    private final TripService tripService;
    private final StationService stationService;

    @Autowired
    public AdminController(AdminService adminService,TripService tripService,StationService stationService ) {
        this.adminService = adminService;
        this.tripService= tripService;
        this.stationService=stationService;
    }
    @PostMapping("/register")
    public void Register(@RequestBody Admin admin){

        adminService.addAdmin(admin);
    }

    /*@PostMapping("/login") //not completed
    public void logIn (@RequestBody Admin admin)
    {adminService.login(Admin admin) ;}*/

    @PostMapping("/addTadrip")
    public void addTrip(@RequestBody Trip trip)
    {
        tripService.addTrips(trip);
    }


    @PostMapping("/addStation")
    public void addStation(@RequestBody Station station)
    {

        stationService.addStations(station);
    }

    @GetMapping("/showStations")
    public List<Station> AllStations(){
        return stationService.listOfStations();}

    @GetMapping("/listOfAdmins")
    public List<Admin> listOfAdmins() {
        return adminService.listOfAdmins();

    }
    @GetMapping("/showTrips")
    public List<Trip> AllTrips(){

        return tripService.listOfTrips();
    }

    @PutMapping("/updateAdmin/{ID}")
    public String UpdateUser(@RequestBody Admin admin ,@PathVariable("ID") long ID){
        return adminService.updateAdmin(admin,ID);

    }

    @PutMapping("/updateTrip/{TripID}")
    public String UpdateTrip(@RequestBody Trip trip ,@PathVariable("TripID") long TripID){
        return tripService.updateTrips(trip,TripID);

    }

    @PutMapping("/updateStation/{StationID}")
    public String UpdateStation(@RequestBody Station station ,@PathVariable("StationID") long StationID){
        return stationService.updateStation(station,StationID);

    }
    @DeleteMapping("/removeAdmin/{ID}")
    public String removeAdmin(@PathVariable("ID") long ID)
    {
        return adminService.RemoveAdmin(ID);
    }

    @DeleteMapping("/removeTrip/{TripID}")
    public String removeTrip(@PathVariable("TripID") long TripID)
    {
        return tripService.RemoveTrip(TripID);
    }

    @DeleteMapping("/removeStation/{StationID}")
    public String removeStation(@PathVariable("StationID") long StationID)
    {
        return stationService.RemoveStation(StationID);
    }
}
