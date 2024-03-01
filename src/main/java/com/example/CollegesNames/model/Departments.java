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
public class Departments {
    @Id
    @Generated
    public int DeptId;
    public String Name;
    public String DeptHod;
    public String DeptCode;
    public String DeptFaculties;
    public String DeptStudents;
    public double DeptFees;
    public String sections;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "college_id" ,referencedColumnName = "id")
    private College college;
}
