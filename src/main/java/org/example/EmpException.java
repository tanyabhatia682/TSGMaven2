package org.example;

public class EmpException extends RuntimeException {

    EmpException(Long id) {
        super("Could not find employee " + id);
    }
}