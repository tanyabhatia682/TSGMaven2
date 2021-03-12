package org.example.Service;

import org.example.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestService
{
    private Map<Long, Employee> employees=new HashMap();
    public String Test()
    {
        return "Test Application";
    }
    public void addEmployee(Employee employee)
    {
        //receives an employee as a parameter and inserts it as a new entry(or updates if existing) in the map
        employees.put((long) employee.getId(), employee);

    }
}
