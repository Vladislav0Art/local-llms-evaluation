package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_ForPastDay_ReturnsCorrectDeltaT {

    @Test
    public void estimate_ForPastDay_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double previousDate = date.minusDays(1);
        double expectedDeltaT = -8.794292e-6; // Actual delta T value for January 1st, 2022
        assertEquals(expectedDeltaT, DeltaT.estimate(previousDate), pow(1e-9, 10));
    }

}