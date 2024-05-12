package com.example.mutation.service;

import com.example.mutation.data.GetEmployeeDetails;
import com.example.mutation.model.Employee;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    GetEmployeeDetails getEmployeeDetails;

    public EmployeeService(GetEmployeeDetails getEmployeeDetails){
        this.getEmployeeDetails=getEmployeeDetails;
    }

    public Employee getEmployeeById(String id){
        return getEmployeeDetails.getEmployeeById(id);
    }

    public boolean addEmployee(Employee employee){
        return getEmployeeDetails.addEmployee(employee);
    }

    public List<Employee> getAllEmployee(){
        return getEmployeeDetails.getEmployees();
    }
}
