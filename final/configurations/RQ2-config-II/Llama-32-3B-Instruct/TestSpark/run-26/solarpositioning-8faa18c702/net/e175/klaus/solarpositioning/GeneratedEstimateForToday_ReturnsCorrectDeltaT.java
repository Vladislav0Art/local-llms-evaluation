package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

import java.util.Arrays;

public class GeneratedEstimateForToday_ReturnsCorrectDeltaT {

    @Test
    public void estimateForToday_ReturnsCorrectDeltaT() {
        LocalDate today = LocalDate.now();
        double deltaT = DeltaT.estimate(today);
        // Use a known value for deltaT for the current date
        double expectedDeltaT = 0;
        assertEquals(expectedDeltaT, deltaT, 1e-9);
    }

}