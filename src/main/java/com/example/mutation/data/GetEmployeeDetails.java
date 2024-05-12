package com.example.mutation.data;

import com.example.mutation.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GetEmployeeDetails {
    private final List<Employee> employees;

    public GetEmployeeDetails(){
        employees=new ArrayList<>();
    }

    public boolean addEmployee(Employee employee){
        return employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeById(String id){
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }
}
