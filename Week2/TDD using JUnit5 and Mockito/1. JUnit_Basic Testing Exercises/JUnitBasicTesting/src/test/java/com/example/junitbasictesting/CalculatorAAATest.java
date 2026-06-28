package com.example.junitbasictesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAAATest {
    private Calculator calculator;
    @BeforeEach
    void setUp() {
        System.out.println("Before Test");
        calculator = new Calculator();
    }
    @AfterEach
    void tearDown() {
        System.out.println("After Test");
    }
    @Test
    void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    void testMultiply() {

        // Arrange
        int a = 10;
        int b = 3;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(30, result);
    }
}