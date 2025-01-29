package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAdd {

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

}