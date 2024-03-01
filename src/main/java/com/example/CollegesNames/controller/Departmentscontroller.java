package com.example.CollegesNames.controller;


import com.example.CollegesNames.model.Departments;
import com.example.CollegesNames.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/colleges/{collegeId}/departments")
public class Departmentscontroller {
    @Autowired
    public DepartmentsService deptService;

    @PostMapping
    public Departments addDepartments(@PathVariable int collegeId, @RequestBody Departments department) {
        return deptService.addDepartments(collegeId, department);
    }
    @GetMapping("/{departmentId}")
    public Departments getDepartments(@PathVariable int DeptId) {
        return deptService.getDepartments(DeptId);
    }

}
