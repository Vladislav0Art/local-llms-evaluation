package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimate_DeltaTForLastDayOfYearReturnsCorrectValue {

    public static double pow(double a, int b) {
        return Math.pow(a, b);
    }

    @Test
    public void estimate_DeltaTForLastDayOfYearReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2020, 12, 31);
        double expectedDeltaT = 229.1025; // Approximate value to test correct result
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate), 1e-6);
    }

}

public class DeltaT {

    public static double estimate(LocalDate forDate) {
        return Math.pow(24, 2) / (Math.pow(365.25, 2));
    }

}