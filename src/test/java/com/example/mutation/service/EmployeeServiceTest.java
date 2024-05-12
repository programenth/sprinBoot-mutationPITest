package com.example.mutation.service;

import com.example.mutation.data.GetEmployeeDetails;
import com.example.mutation.model.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @InjectMocks
    EmployeeService employeeService;

    @Mock
    GetEmployeeDetails getEmployeeDetails;

    @Test
    void shouldReturnTrue_WhenAddEmpolyeeCalled(){
        Employee emp=new Employee("1","Sac","Consul");
        when(getEmployeeDetails.addEmployee(emp)).thenReturn(true);
        boolean res=employeeService.addEmployee(emp);
        assertThat(res).isTrue();
    }

    @Test
    void shouldReturnList_WhenGetAllEmployeesCalled(){
        Employee emp=new Employee("1","Sac","Consul");
        when(getEmployeeDetails.getEmployeeById("1")).thenReturn(emp);
        Employee res=employeeService.getEmployeeById("1");
        assertThat(res).isNotNull().isEqualTo(emp);
        assertThat(res.getId()).isEqualTo("1");
    }


}
