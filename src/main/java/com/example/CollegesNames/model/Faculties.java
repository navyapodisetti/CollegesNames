package com.example.CollegesNames.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculties {
    @Id
    @Generated
    public int facultyId;
    public String facultyName;
    public String collegeName;
    public String departments;
    public double fees;
    public String faculties;
    public double phnNumber;
    public String facultyEmail;
    public String facultyAddress;
    public String facultyGender;
    public String facultyQualification;
    public int facultyExperience;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "college_id",referencedColumnName = "id")
    private College college;

}
