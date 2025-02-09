package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimate_DeltaTForFirstDayOfYearReturnsCorrectValue {

    public static double pow(double a, int b) {
        return Math.pow(a, b);
    }

    @Test
    public void estimate_DeltaTForFirstDayOfYearReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2020, 3, 1);
        double expectedDeltaT = 229.1025; // Approximate value to test correct result
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate), 1e-6);
    }

}