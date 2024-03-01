package com.example.CollegesNames.service;

import com.example.CollegesNames.model.Departments;
import com.example.CollegesNames.repository.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentsService {
    @Autowired
    public DepartmentsRepository Repo;

    public Departments addDepartments(int collegeId, Departments department) {
        return Repo.save(department);
    }

    public Departments getDepartments(int DeptId) {
        return Repo.findById(DeptId).get();
    }
}
