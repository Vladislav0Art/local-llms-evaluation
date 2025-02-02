package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedEstimateDeltaTEarly20thCenturyTest {

    @Test
    public void estimateDeltaTEarly20thCenturyTest() throws Exception {
        java.time.LocalDate forDate = java.time.LocalDate.of(1900, 1, 1);
        try {
            DeltaT.estimate(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertEquals(-2.79, -2.79, 1e-6);
    }

}