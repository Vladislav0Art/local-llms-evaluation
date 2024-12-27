package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        final double epsilon = 1e-15;
        try {
            DeltaT.estimate(null);
        } catch (NullPointerException e) {
            assertEquals("Expected message when no date is provided", e.getMessage());
        }
    }

}