package com.example.CollegesNames.repository;

import com.example.CollegesNames.model.Faculties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculties,Integer> {
    List<Faculties> findAllByCollegeId(int collegeId);
}
