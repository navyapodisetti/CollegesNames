package com.example.CollegesNames.service;

import com.example.CollegesNames.model.College;
import com.example.CollegesNames.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollegeService {
    @Autowired
    public CollegeRepository repo;
    public College addCollege(College college) {
        return repo.save(college);
    }
    public List<College> getAllColleges() {
        return repo.findAll();
    }

    public College getCollegeById(int CollegeId) {
        return repo.findById(CollegeId).orElse(null);
    }

    public College updateCollegeName(int collegeId, College collegeDetails) {
        College college = getCollegeById(collegeId);
        return repo.save(college);
    }
    public String deleteCollegeById(int collegeId) {
        repo.deleteById(collegeId);
        return "college data is deleted with"+collegeId;
    }
}
