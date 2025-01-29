package org.jsoup.nodes;

import static org.junit.Assert.*;

public class GeneratedTestDivide {

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
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.01); // Expected result is 5.0 with a small tolerance for floating-point precision issues
    }

}