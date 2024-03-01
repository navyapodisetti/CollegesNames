package com.example.CollegesNames.repository;

import com.example.CollegesNames.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DepartmentsRepository extends JpaRepository<Departments,Integer> {
}