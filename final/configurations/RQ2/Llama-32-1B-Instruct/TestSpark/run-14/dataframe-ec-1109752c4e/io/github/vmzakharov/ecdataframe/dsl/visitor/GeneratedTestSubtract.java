package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSubtract {

    public double add(double x, double y) {
        return x + y;
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

}