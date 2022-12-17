package com.example.assignment.repo;

import com.example.assignment.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adminRepo extends JpaRepository<Admin,Long> {
}
