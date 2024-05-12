package com.example.mutation.controller;

import com.example.mutation.model.Employee;
import com.example.mutation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable String id){
        Employee employee=employeeService.getEmployeeById(id);
        if (employee==null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(employee);
    }

    @PostMapping("employees")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
        boolean res=employeeService.addEmployee(employee);
        if(res) return ResponseEntity.ok("Employee added successfully");
        return ResponseEntity.badRequest().body("Error adding new employee");
    }

    @GetMapping("employees")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employeeList2=employeeService.getAllEmployee();
        return ResponseEntity.ok(employeeList2);
    }
}
