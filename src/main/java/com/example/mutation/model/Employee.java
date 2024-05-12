package com.example.mutation.model;

public class Employee {
    String id;
    String empName;
    String role;

    public Employee(String id, String empName, String role) {
        this.id = id;
        this.empName = empName;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
