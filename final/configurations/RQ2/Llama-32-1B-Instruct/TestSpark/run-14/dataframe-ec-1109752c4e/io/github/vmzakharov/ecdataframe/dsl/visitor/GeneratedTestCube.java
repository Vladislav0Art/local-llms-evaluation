package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCube {

    public double add(double x, double y) {
        return x + y;
    }

    @Test
    public void testCube() {
        assertEquals(125.0, cube(5.0), Double.compareClosestMagnitude);
        assertEquals(-216.0, cube(-3.0), Double.compareClosestMagnitude);
        assertEquals(216.0, cube(6.0));
    }

}