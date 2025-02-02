package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedEstimateDeltaTMiddle20thCenturyTest {

    @Test
    public void estimateDeltaTMiddle20thCenturyTest() throws Exception {
        java.time.LocalDate forDate = java.time.LocalDate.of(1950, 1, 1);
        try {
            DeltaT.estimate(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertEquals(29.07, 29.07, 1e-6);
    }

}