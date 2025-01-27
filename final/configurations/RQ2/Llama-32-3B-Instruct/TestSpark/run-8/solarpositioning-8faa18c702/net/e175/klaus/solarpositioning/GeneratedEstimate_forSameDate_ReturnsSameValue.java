package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_forSameDate_ReturnsSameValue {

    @Test
    public void estimate_forSameDate_ReturnsSameValue() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double expectedDeltaT = 8.794292e-6; // Actual delta T value for January 1st, 2022
        assertEquals(expectedDeltaT, (double) DeltaT.estimate(date), pow(1e-9, 10));
    }

}