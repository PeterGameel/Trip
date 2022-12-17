package com.example.assignment.repo;

import com.example.assignment.model.Admin;
import com.example.assignment.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepo extends JpaRepository<Trip,Long> {
}
