package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimate_DeltaTForLeapDayReturnsZero {

    public static double pow(double a, int b) {
        return Math.pow(a, b);
    }

    @Test
    public void estimate_DeltaTForLeapDayReturnsZero() {
        LocalDate forDate = LocalDate.of(2000, 2, 29);
        double expectedDeltaT = 0.000000061; // Adjusted value to test zero
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate), 1e-6);
    }

}