package com.employee.employee.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false)
    private long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeAge;
    private String employeeAddress;
    private String employeeAbout;
    private String employeeEmail;
    private String employeePassword;
    private String employeeContactNumber;
    private String employeeDOB;
}
