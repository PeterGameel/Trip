package com.example.assignment.repo;

import com.example.assignment.model.Admin;
import com.example.assignment.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepo extends JpaRepository<Station,Long> {
}
