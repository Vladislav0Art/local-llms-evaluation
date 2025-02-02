package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSolarPosition {

    @Test
    public void testSolarPosition() {
        // Test case 1: 1820-01-01
        LocalDate forDate = LocalDate.of(1820, 1, 1);
        assertEquals(-20 + 32 * pow(0.18, 2), result, 0.00001);

        // Test case 2: 1027-01-01
        forDate = LocalDate.of(1027, 1, 1);
        assertEquals(-20 + 32 * pow(3.27, 2), result, 0.00001);

        // Test case 3: 1700-01-01
        forDate = LocalDate.of(1700, 1, 1);
        assertEquals(-2.79 + 1.494119 * -0.85 - pow(-0.85, 2) / 10000, result, 0.00001);

        // Test case 4: 1999-01-01
        forDate = LocalDate.of(1999, 1, 1);
        assertEquals(63.86 + 0.3345 * -0.99 - pow(-0.99, 2) / 360000 + 0.000651814 * pow(-0.99, 4), result, 0.00001);
    }

    public double calculateSolarPosition() {
        // implementation of the formula
        return Math.pow(0.18, 2) + Math.pow(3.27, 2);
    }

}