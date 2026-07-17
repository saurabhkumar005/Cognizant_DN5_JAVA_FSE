package com.cognizant.tddlearn.service;

import org.junit.jupiter.api.Test;

public class calculatorServiceTest {

    @Test
    void testAdd() {
        CalculatorService calculator = new CalculatorService();
        int result = calculator.add(10, 20);
        System.out.println("Addition Result = " + result);
    }
}
