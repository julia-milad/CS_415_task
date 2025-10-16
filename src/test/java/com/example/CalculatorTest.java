package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        int expected = 15;
        int actual = calculator.addition(10, 5);
        assertEquals(expected, actual, "Addition of numbers failed.");
    }

    @Test
    void testSubtraction() {
        int expected = 5;
        int actual = calculator.subtract(10, 5);
        assertEquals(expected, actual, "Subtraction of numbers failed.");
    }

    @Test
    void testDivision() {
        int expected = 2;
        int actual = calculator.divide(10, 5);
        assertEquals(expected, actual, "Division of numbers failed.");
    }

    @Test
    void testMultiplication() {
        int expected = 50;
        int actual = calculator.multiply(10, 5);
        assertEquals(expected, actual, "Multiplication of numbers failed.");
    }
}