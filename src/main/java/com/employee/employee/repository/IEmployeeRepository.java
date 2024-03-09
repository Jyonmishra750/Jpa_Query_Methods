package com.employee.employee.repository;

import com.employee.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    // After `findBy`, all the method names should be same as your domain class variable name.
    Optional<Employee> findByEmployeeId(long id);
    Optional<List<Employee>> findByEmployeeFirstName(String firstName);
    Optional<List<Employee>> findByEmployeeFirstNameLike(String firstName);
    Optional<List<Employee>> findByEmployeeFirstNameNotLike(String firstName);
    Optional<List<Employee>> findByEmployeeLastName(String lastName);
    Optional<List<Employee>> findByEmployeeLastNameLike(String firstName);
    Optional<List<Employee>> findByEmployeeLastNameNotLike(String firstName);
    Optional<List<Employee>> findByEmployeeEmail(String email);
    Optional<List<Employee>> findByEmployeeEmailAndEmployeePassword(String email, String password);
    Optional<List<Employee>> findByEmployeeEmailOrEmployeePassword(String email, String password);
    Optional<List<Employee>> findByEmployeeFirstNameAndEmployeeLastName(String fName, String lName);
    Optional<List<Employee>> findByEmployeeFirstNameOrEmployeeLastName(String fName, String lName);
    Optional<List<Employee>> findByEmployeeAge(int age);
    Optional<List<Employee>> findByEmployeeAgeLessThan(int lessThanAge);
    Optional<List<Employee>> findByEmployeeAgeGreaterThan(int greaterThanAge);
    Optional<List<Employee>> findByEmployeeAgeLessThanEqual(int lessThanEqualAge);
    Optional<List<Employee>> findByEmployeeAgeGreaterThanEqual(int greaterThanEqualAge);
    Optional<List<Employee>> findByEmployeeContactNumber(String contactNumber);
    Optional<List<Employee>> findByEmployeeDOB(String dob);
    Optional<List<Employee>> findByEmployeeDOBAfter (String dobAfter);
    Optional<List<Employee>> findByEmployeeDOBBefore (String dobBefore);
    Optional<List<Employee>> findByEmployeeDOBBetween (String dobBetween1, String dobBetween2);
    Optional<List<Employee>> findByEmployeeFirstNameStartingWith(String fName);
    Optional<List<Employee>> findByEmployeeLastNameStartingWith(String lName);
    Optional<List<Employee>> findByEmployeeFirstNameEndingWith(String fName);
    Optional<List<Employee>> findByEmployeeLastNameEndingWith(String lName);
    Optional<List<Employee>> findByEmployeeFirstNameContaining(String fName);
    Optional<List<Employee>> findByEmployeeLastNameContaining(String lName);
    Optional<List<Employee>> findByOrderByEmployeeAgeDesc();
    Optional<List<Employee>> findByOrderByEmployeeAgeAsc();
}
