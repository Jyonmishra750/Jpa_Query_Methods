package com.employee.employee.service;

import com.employee.employee.domain.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface IEmployeeService {
    Employee createAccount(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(long id);

    List<Employee> getEmployeeByFirstName(String fName);

    List<Employee> getEmployeeByFirstNameLike(String fName);

    List<Employee> getEmployeeByFirstNameNotLike(String fName);

    List<Employee> getEmployeeByLastName(String lName);

    List<Employee> getEmployeeByLastNameLike(String lName);

    List<Employee> getEmployeeByLastNameNotLike(String fName);

    List<Employee> getEmployeeByFirstNameStartingWith(String name);

    List<Employee> getEmployeeByFirstNameEndingWith(String name);

    List<Employee> getEmployeeByFirstNameContainingWith(String name);

    List<Employee> getEmployeeByLastNameStartingWith(String name);

    List<Employee> getEmployeeByLastNameEndingWith(String name);

    List<Employee> getEmployeeByLastNameContainingWith(String name);

    List<Employee> getEmployeeByFirstnameOrLastName(String fName, String lName);

    List<Employee> getEmployeeByFirstnameAndLastName(String fName, String lName);

    List<Employee> getEmployeeByAge(int age);

    List<Employee> getEmployeeByAgeDescending();

    List<Employee> getEmployeeByAgeAscending();

    List<Employee> getEmployeeByAgeLessThan(int lessThanAge);

    List<Employee> getEmployeeByAgeLessThanEqual(int lessThanAge);

    List<Employee> getEmployeeByAgeGreaterThan(int greaterThanAge);

    List<Employee> getEmployeeByAgeGreaterThanEqual(int greaterThanAge);

    List<Employee> getEmployeeByEmail(String email);

    List<Employee> getEmployeeByEmailAndPassword(String email, String password);

    List<Employee> getEmployeeByEmailOrPassword(String email, String password);

    List<Employee> getEmployeeByContactNumber(String contactNumber);

    List<Employee> getEmployeeByDOB(String dob);

    List<Employee> getEmployeeDOBAfter(String dob);

    List<Employee> getEmployeeDOBBefore(String dob);

    List<Employee> getEmployeeDOBBetween(String dob1, String dob2);
}


