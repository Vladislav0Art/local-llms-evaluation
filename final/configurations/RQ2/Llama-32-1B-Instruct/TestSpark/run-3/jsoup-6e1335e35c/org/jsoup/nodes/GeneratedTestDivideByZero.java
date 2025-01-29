package org.jsoup.nodes;

import static org.junit.Assert.*;

public class GeneratedTestDivideByZero {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Subtraction by zero is not allowed");
        }
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) num1 / num2;
    }
}

public class CalculatorTest {

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10, 0);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected exception
        }
    }

}