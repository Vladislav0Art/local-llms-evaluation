package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestPower {

    public double add(double x, double y) {
        return x + y;
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

}