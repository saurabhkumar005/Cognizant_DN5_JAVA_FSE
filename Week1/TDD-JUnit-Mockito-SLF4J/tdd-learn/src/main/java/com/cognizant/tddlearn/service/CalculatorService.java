package com.cognizant.tddlearn.service;

public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public String getMessage() {
        return "JUnit Testing";
    }
}
