package org.example;

import com.sun.istack.internal.logging.Logger;
import jdk.nashorn.internal.objects.NativeMath;
import org.example.dto.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class EmployeeBeanImpln implements EmpBean {


    public static Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@//myorclhost:5521/myorcldbservice", "hr", "hr");
        return connection;
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {

        List<Employee> returnValue = new ArrayList<>();
        try (Connection connection = getConnection()) {
            try (Statement statement = connection.createStatement()) {
                try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, name, address FROM EMPLOYEES WHERE id= ?")) {
                    //preparedStatement.setInt(1, empid);

                try (ResultSet resultSet = statement.executeQuery("SELECT id, name, address FROM EMPLOYEES")) {
                    while (resultSet.next()) {
                        returnValue.add(new Employee(resultSet));
                    }
                }
            }

        } catch (SQLException ex) {
            Logger logger = null;
            logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        return returnValue;
    }

    //public List<Employee> getEmployee(int id) {

    }
}
