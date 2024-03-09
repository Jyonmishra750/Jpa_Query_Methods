package com.employee.employee.controller;

import com.employee.employee.domain.Employee;
import com.employee.employee.service.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private final IEmployeeService service;

    @PostMapping
    public Employee createAccounts(@RequestBody Employee employee){
        return service.createAccount(employee);
    }

    @PostMapping("/fal/{FirstnameAndLastName}")
    public List<Employee> employeesByFirstnameAndLastName(@RequestParam String fName, @RequestParam String lName){
        return service.getEmployeeByFirstnameAndLastName(fName, lName);
    }

    @PostMapping("/fol/{FirstnameOrLastName}")
    public List<Employee> employeesByFirstnameOrLastName(@RequestParam String fName, @RequestParam String lName){
        return service.getEmployeeByFirstnameOrLastName(fName, lName);
    }

//    @PostMapping("/{login}")
//    public List<Employee> employeesByEmailAndPassword(@RequestBody String email, @RequestBody String password){
//        return service.getEmployeeByEmailAndPassword(email, password);
//    }

    @PostMapping("/eap/{EmailAndPassword}")
    public List<Employee> employeesByEmailAndPassword(@RequestParam String email, @RequestParam String password){
        return service.getEmployeeByEmailAndPassword(email, password);
    }

    @PostMapping("/eop/{EmailOrPassword}")
    public List<Employee> employeesByEmailOrPassword(@RequestParam String email, @RequestParam String password){
        return service.getEmployeeByEmailOrPassword(email, password);
    }

    @PostMapping("/dobBetween/{dobBetween}")
    public List<Employee> employeeByDOBBetween(@RequestParam String dobBetween1, @RequestParam String dobBetween2){
        return service.getEmployeeDOBBetween(dobBetween1, dobBetween2);
    }

    @GetMapping
    public List<Employee> allEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee employeeByEmployeeId(@PathVariable long id){
        return service.getEmployeeById(id);
    }

    @GetMapping("/email/{email}")
    public List<Employee> employeeByEmail(@PathVariable String email){
        return service.getEmployeeByEmail(email);
    }

    @GetMapping("/age/{age}")
    public List<Employee> employeeByAge(@PathVariable int age){
        return service.getEmployeeByAge(age);
    }

    @GetMapping("/ageDescending")
    public List<Employee> employeeByAgeDescending(){
        return service.getEmployeeByAgeDescending();
    }

    @GetMapping("/ageAscending")
    public List<Employee> employeeByAgeAscending(){
        return service.getEmployeeByAgeAscending();
    }
    @GetMapping("/lessThanAge/{lessThanAge}")
    public List<Employee> employeeByAgeLessThan(@PathVariable int lessThanAge){
        return service.getEmployeeByAgeLessThan(lessThanAge);
    }

    @GetMapping("/lessThanEqualAge/{lessThanEqualAge}")
    public List<Employee> employeeByAgeLessThanEqual(@PathVariable int lessThanEqualAge){
        return service.getEmployeeByAgeLessThanEqual(lessThanEqualAge);
    }

    @GetMapping("/greaterThanAge/{greaterThanAge}")
    public List<Employee> employeeByAgeGreaterThan(@PathVariable int greaterThanAge){
        return service.getEmployeeByAgeGreaterThan(greaterThanAge);
    }

    @GetMapping("/greaterThanEqualAge/{greaterThanEqualAge}")
    public List<Employee> employeeByAgeGreaterThanEqual(@PathVariable int greaterThanEqualAge){
        return service.getEmployeeByAgeGreaterThanEqual(greaterThanEqualAge);
    }

    @GetMapping("/contactNumber/{contactNumber}")
    public List<Employee> employeeByContactNumber(@PathVariable String contactNumber){
        return service.getEmployeeByContactNumber(contactNumber);
    }

    @GetMapping("/dob/{dob}")
    public List<Employee> employeeByDOB(@PathVariable String dob){
        return service.getEmployeeByDOB(dob);
    }

    @GetMapping("/dobAfter/{dobAfter}")
    public List<Employee> employeeByDOBAfter(@PathVariable String dobAfter){
        return service.getEmployeeDOBAfter(dobAfter);
    }

    @GetMapping("/dobBefore/{dobBefore}")
    public List<Employee> employeeByDOBBefore(@PathVariable String dobBefore){
        return service.getEmployeeDOBBefore(dobBefore);
    }

    @GetMapping("/firstName/{fName}")
    public List<Employee> employeeByFirstName(@PathVariable String fName){
        return service.getEmployeeByFirstName(fName);
    }

    @GetMapping("/firstNameLike/{fNameLike}")
    public List<Employee> employeeByFirstNameLike(@PathVariable String fNameLike){
        return service.getEmployeeByFirstNameLike(fNameLike);
    }

    @GetMapping("/firstNameNotLike/{fNameNotLike}")
    public List<Employee> employeeByFirstNameNotLike(@PathVariable String fNameNotLike){
        return service.getEmployeeByFirstNameNotLike(fNameNotLike);
    }

    @GetMapping("/lastName/{lName}")
    public List<Employee> employeeByLastName(@PathVariable String lName){
        return service.getEmployeeByLastName(lName);
    }

    @GetMapping("/lastNameLike/{lNameLike}")
    public List<Employee> employeeByLastNameLike(@PathVariable String lNameLike){
        return service.getEmployeeByLastNameLike(lNameLike);
    }

    @GetMapping("/lastNameNotLike/{lNameNotLike}")
    public List<Employee> employeeByLastNameNotLike(@PathVariable String lNameNotLike){
        return service.getEmployeeByLastNameNotLike(lNameNotLike);
    }

    @GetMapping("/fNameStartingWith/{fName}")
    public List<Employee> employeeByFirstNameStartsWith(@PathVariable String fName){
        return service.getEmployeeByFirstNameStartingWith(fName);
    }

    @GetMapping("/fNameEndingWith/{fName}")
    public List<Employee> employeeByFirstNameEndingWith(@PathVariable String fName){
        return service.getEmployeeByFirstNameEndingWith(fName);
    }

    @GetMapping("/fNameContainingWith/{fName}")
    public List<Employee> employeeByFirstNameContainingWith(@PathVariable String fName){
        return service.getEmployeeByFirstNameContainingWith(fName);
    }

    @GetMapping("/lNameStartingWith/{lName}")
    public List<Employee> employeeByLastNameStartsWith(@PathVariable String lName){
        return service.getEmployeeByLastNameStartingWith(lName);
    }

    @GetMapping("/lNameEndingWith/{lName}")
    public List<Employee> employeeByLastNameEndingWith(@PathVariable String lName){
        return service.getEmployeeByLastNameEndingWith(lName);
    }

    @GetMapping("/lNameContainingWith/{lName}")
    public List<Employee> employeeByLastNameContainingWith(@PathVariable String lName){
        return service.getEmployeeByLastNameContainingWith(lName);
    }
}
