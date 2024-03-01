package com.example.CollegesNames.controller;


import com.example.CollegesNames.model.College;
import com.example.CollegesNames.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Institutes")
public class Collegecontroller {
    @Autowired
    public CollegeService cservice;
    @PostMapping("/addcollege")
        public College addCollege(@RequestBody College college) {
            return cservice.addCollege(college);
        }
        @GetMapping("/Allcolleges")
        public List<College> getAllColleges() {
        return cservice.getAllColleges();
        }
       @GetMapping("/{collegeId}")
       public College getcollege(@PathVariable int collegeId){
        return cservice.getCollegeById(collegeId);
        }
        @PutMapping("/{collegeId}")
       public College updateCollegeName(@PathVariable int collegeId, @RequestBody College collegedetails) {
           return cservice.updateCollegeName(collegeId, collegedetails);
        }
        @DeleteMapping("/{collegeId}")
        public String deleteCollege(@PathVariable int collegeId){
        return cservice.deleteCollegeById(collegeId);
    }
}



