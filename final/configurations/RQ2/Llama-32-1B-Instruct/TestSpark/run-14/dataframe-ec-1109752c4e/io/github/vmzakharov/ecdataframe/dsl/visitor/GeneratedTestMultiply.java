package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestMultiply {

    public double add(double x, double y) {
        return x + y;
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

}