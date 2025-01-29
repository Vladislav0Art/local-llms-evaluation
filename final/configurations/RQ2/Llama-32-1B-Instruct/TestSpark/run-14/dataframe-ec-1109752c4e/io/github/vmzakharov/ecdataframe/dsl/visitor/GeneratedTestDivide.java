package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestDivide {

    public double add(double x, double y) {
        return x + y;
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

}