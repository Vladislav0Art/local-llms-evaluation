package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    @Test
    public void testAddition() {
        double result = add(5.0, 3.0);
        assertEquals(8.0, result, 1e-4); // Floating point comparison for small decimal differences
    }

    @Test
    public void testSubtraction() {
        double result = subtract(10.0, 2.0);
        assertEquals(8.0, result, 1e-4);
    }

}