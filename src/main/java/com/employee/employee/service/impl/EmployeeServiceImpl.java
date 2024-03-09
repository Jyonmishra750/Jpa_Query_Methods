package com.employee.employee.service.impl;

import com.employee.employee.domain.Employee;
import com.employee.employee.repository.IEmployeeRepository;
import com.employee.employee.service.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeRepository employeeRepository;
    @Override
    public Employee createAccount(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findByEmployeeId(id).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByFirstName(String fName) {
        return employeeRepository.findByEmployeeFirstName(fName).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByFirstNameLike(String fName) {
        return employeeRepository.findByEmployeeFirstNameLike(fName).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByFirstNameNotLike(String fName) {
        return employeeRepository.findByEmployeeFirstNameNotLike(fName).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByFirstNameStartingWith(String name) {
        return employeeRepository.findByEmployeeFirstNameStartingWith(name).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByFirstNameEndingWith(String name) {
        return employeeRepository.findByEmployeeFirstNameEndingWith(name).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByFirstNameContainingWith(String name) {
        return employeeRepository.findByEmployeeFirstNameContaining(name).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByLastNameStartingWith(String name) {
        return employeeRepository.findByEmployeeLastNameStartingWith(name).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByLastNameEndingWith(String name) {
        return employeeRepository.findByEmployeeLastNameEndingWith(name).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByLastNameContainingWith(String name) {
        return employeeRepository.findByEmployeeLastNameContaining(name).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByFirstnameOrLastName(String fName, String lName) {
        return employeeRepository.findByEmployeeFirstNameOrEmployeeLastName(fName, lName).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByFirstnameAndLastName(String fName, String lName) {
        return employeeRepository.findByEmployeeFirstNameAndEmployeeLastName(fName, lName).orElseThrow() ;
    }

    @Override
    public List<Employee> getEmployeeByLastName(String lName) {
        return employeeRepository.findByEmployeeLastName(lName).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByLastNameLike(String lName) {
        return employeeRepository.findByEmployeeLastNameLike(lName).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByLastNameNotLike(String lName) {
        return employeeRepository.findByEmployeeLastNameNotLike(lName).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByAge(int age) {
        return employeeRepository.findByEmployeeAge(age).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByAgeAscending() {
        return employeeRepository.findByOrderByEmployeeAgeAsc().orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByAgeDescending() {
        return employeeRepository.findByOrderByEmployeeAgeDesc().orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByAgeLessThan(int lessThanAge) {
        return employeeRepository.findByEmployeeAgeLessThan(lessThanAge).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByAgeLessThanEqual(int lessThanEqualAge) {
        return employeeRepository.findByEmployeeAgeLessThanEqual(lessThanEqualAge).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByAgeGreaterThan(int greaterThanAge) {
        return employeeRepository.findByEmployeeAgeGreaterThan(greaterThanAge).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByAgeGreaterThanEqual(int greaterThanEqualAge) {
        return employeeRepository.findByEmployeeAgeGreaterThanEqual(greaterThanEqualAge).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByEmail(String email) {
        return employeeRepository.findByEmployeeEmail(email).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByEmailAndPassword(String email, String password) {
        return employeeRepository.findByEmployeeEmailAndEmployeePassword(email, password).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByContactNumber(String contactNumber) {
        return employeeRepository.findByEmployeeContactNumber(contactNumber).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByDOB(String dob) {
        return employeeRepository.findByEmployeeDOB(dob).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeDOBAfter(String dob) {
        return employeeRepository.findByEmployeeDOBAfter(dob).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeDOBBefore(String dob) {
        return employeeRepository.findByEmployeeDOBBefore(dob).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeDOBBetween(String dob1, String dob2) {
        return employeeRepository.findByEmployeeDOBBetween(dob1, dob2).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeeByEmailOrPassword(String email, String password) {
        return employeeRepository.findByEmployeeEmailOrEmployeePassword(email, password).orElseThrow();
    }
}
