package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

import java.util.Arrays;

public class GeneratedEstimateForDifferentDays_ReturnsCorrectDeltaT {

    @Test
    public void estimateForDifferentDays_ReturnsCorrectDeltaT() {
        LocalDate differentDayYesterday = LocalDate.now().minusDays(10);
        double differentDayDeltaT = DeltaT.estimate(differentDayYesterday);
        // Use a known value for deltaT for the current date
        double expectedDeltaT = 0;
        assertEquals(expectedDeltaT, differentDayDeltaT, 1e-9);
    }

}