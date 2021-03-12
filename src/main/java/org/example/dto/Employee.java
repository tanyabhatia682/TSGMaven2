package org.example.dto;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;


/**
 * Hello world!
 *
 */

public class Employee
{
    private int id;
    private String name;
    private String address;
    public Employee(ResultSet resultSet) throws SQLException {
        this.id = resultSet.getInt(1);
        this.name = resultSet.getString(2);
        this.address = resultSet.getString(3);
    }
        Employee() {}

        Employee(String name, String address) {

            this.name = name;
            this.address = address;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getAddress() {
            return this.address;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }


        @Override
        public String toString()
        {
            return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", address='" + this.address + '\'' + '}';
        }
    }