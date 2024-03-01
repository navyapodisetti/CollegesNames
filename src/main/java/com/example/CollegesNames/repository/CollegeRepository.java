package com.example.CollegesNames.repository;

import com.example.CollegesNames.model.College;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CollegeRepository extends JpaRepository<College,Integer> {
}
