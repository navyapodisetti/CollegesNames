package com.example.CollegesNames.controller;

import com.example.CollegesNames.model.Faculties;
import com.example.CollegesNames.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments/{departmentId}/faculties")

public class Facultycontroller {
    @Autowired
    public FacultyService facultyService;

    @PostMapping("/{collegeId}/faculties")
    public Faculties addFacultyToCollege(@RequestBody Faculties faculty) {
        return facultyService.addFacultyToCollege(faculty);
    }
    @GetMapping("/{collegeId}/faculties")
    public List<Faculties> getAllFacultiesByCollegeId(@PathVariable int collegeId) {
        return facultyService.getAllFacultiesByCollegeId(collegeId);
    }
}