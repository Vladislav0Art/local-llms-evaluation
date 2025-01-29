package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSquare {

    public double add(double x, double y) {
        return x + y;
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

}