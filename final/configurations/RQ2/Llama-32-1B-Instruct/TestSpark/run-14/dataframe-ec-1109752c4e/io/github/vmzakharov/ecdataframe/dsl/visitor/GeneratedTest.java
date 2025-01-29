package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    public double add(double x, double y) {
        return x + y;
    }

    @Test
    public void testAdd() {
        assertEquals(10, add(1.0, 4.0));
        assertEquals(11.0, add(-3.0, -2.0), Double.compareClosestMagnitude);
        assertEquals(7.0, add(6.0, 9.0));
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    @Test
    public void testSubtract() {
        assertEquals(-3.0, subtract(1.0, 4.0), Double.compareClosestMagnitude);
        assertEquals(11.0, subtract(-3.0, -2.0), Double.compareClosestMagnitude);
        assertEquals(7.0, subtract(6.0, 9.0));
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    @Test
    public void testMultiply() {
        assertEquals(10.0, multiply(1.0, 4.0), Double.compareClosestMagnitude);
        assertEquals(-21.0, multiply(3.0, -2.0), Double.compareClosestMagnitude);
        assertEquals(42.0, multiply(6.0, 9.0));
    }

    public double divide(double x, double y) {
        if (y == 0.0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return x / y;
    }

    @Test
    public void testDivide() {
        assertEquals(10.0, divide(1.0, 4.0), Double.compareClosestMagnitude);
        assertEquals(-21.0, divide(3.0, -2.0), Double.compareClosestMagnitude);
        assertEquals(42.0, divide(6.0, 9.0));
    }

    public double power(double x, int y) {
        return Math.pow(x, y);
    }

    @Test
    public void testPower() {
        assertEquals(100.0, power(2.0, 4), Double.compareClosestMagnitude);
        assertEquals(-81.0, power(3.0, -2), Double.compareClosestMagnitude);
        assertEquals(1296.0, power(6.0, 4));
    }

    public double square(double x) {
        return Math.pow(x, 2);
    }

    @Test
    public void testSquare() {
        assertEquals(25.0, square(5.0), Double.compareClosestMagnitude);
        assertEquals(9.0, square(-3.0), Double.compareClosestMagnitude);
        assertEquals(36.0, square(6.0));
    }

    public double cube(double x) {
        return Math.pow(x, 3);
    }

    @Test
    public void testCube() {
        assertEquals(125.0, cube(5.0), Double.compareClosestMagnitude);
        assertEquals(-216.0, cube(-3.0), Double.compareClosestMagnitude);
        assertEquals(216.0, cube(6.0));
    }

}