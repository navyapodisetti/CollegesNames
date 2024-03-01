package com.example.CollegesNames.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {
    @Id
    @GeneratedValue
    public int id;
    public String collegeName;
    public String location;
    public String departments;
    public String courses;
    public String students;
    public String faculties;
    public double fees;
    public double phnNumber;
    public String email;
    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Departments> dept;
    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Faculties> faculty;

}
