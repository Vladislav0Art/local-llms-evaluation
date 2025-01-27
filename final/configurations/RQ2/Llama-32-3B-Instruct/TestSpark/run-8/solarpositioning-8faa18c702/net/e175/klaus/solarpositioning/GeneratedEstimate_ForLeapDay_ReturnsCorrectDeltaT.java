package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_ForLeapDay_ReturnsCorrectDeltaT {

    @Test
    public void estimate_ForLeapDay_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        double expectedDeltaT = 8.795111e-6; // Actual delta T value for February 29th, 2020
        assertEquals(expectedDeltaT, (double) DeltaT.estimate(date), pow(1e-9, 10));
    }

}