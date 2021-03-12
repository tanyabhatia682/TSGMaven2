package org.example;

import org.example.dto.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmpBean
{
    public List<Employee> getEmployees() throws SQLException;
}
