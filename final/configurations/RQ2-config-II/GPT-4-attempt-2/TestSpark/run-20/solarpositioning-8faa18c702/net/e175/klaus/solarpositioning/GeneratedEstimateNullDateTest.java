package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("date must not be null", e.getMessage());
        }
    }

}