package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedEstimateDeltaTLate20thCenturyTest {

    @Test
    public void estimateDeltaTLate20thCenturyTest() throws Exception {
        java.time.LocalDate forDate = java.time.LocalDate.of(2005, 1, 1);
        try {
            DeltaT.estimate(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertEquals(63.86, 63.86, 1e-6);
    }

}