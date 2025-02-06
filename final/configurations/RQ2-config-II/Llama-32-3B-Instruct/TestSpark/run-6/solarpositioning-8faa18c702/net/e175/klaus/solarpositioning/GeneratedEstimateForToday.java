package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateForToday {

    @Test
    public void estimateForToday() {
        LocalDate forDate = LocalDate.now();
        double result = DeltaT.estimate(forDate);
        // Assuming DeltaT.estimate() returns a non-zero value, or at least not zero.
        assertNotEquals(0, result);
    }

}