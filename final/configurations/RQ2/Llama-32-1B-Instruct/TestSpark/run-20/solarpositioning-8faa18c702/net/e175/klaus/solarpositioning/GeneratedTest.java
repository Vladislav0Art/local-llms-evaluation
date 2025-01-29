package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}

public class TestCalculator {

    @Before
    public void setUp() {
        System.out.println("Setup");
    }

}