package com.example.CollegesNames.service;

import com.example.CollegesNames.model.Faculties;
import com.example.CollegesNames.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacultyService {
    @Autowired
    public FacultyRepository repo;

    public Faculties addFacultyToCollege( Faculties faculty) {
        return repo.save(faculty);
    }

    public List<Faculties> getAllFacultiesByCollegeId(int collegeId) {
        return repo.findAllByCollegeId(collegeId);
    }

}
