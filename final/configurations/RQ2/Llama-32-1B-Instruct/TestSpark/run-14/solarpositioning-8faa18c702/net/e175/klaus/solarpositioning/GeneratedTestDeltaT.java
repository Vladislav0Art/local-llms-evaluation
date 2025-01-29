package net.e175.klaus.solarpositioning;

import org.junit.Test;

public class GeneratedTestDeltaT {

    @Test
    public void testDeltaT() {
        for (int i = -20; i <= 19; i++) {
            assertDoubleIsWithin(0, MIN ΔT + i * 4, MIN ΔT + i * 3);
        }
    }

    private static boolean isWithin(double lower, double upper, double value) {
        return Math.abs(value - lower) < upper / 2;
    }

}