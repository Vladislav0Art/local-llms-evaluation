package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            fail("Should raise a NullPointerException");
        } catch (NullPointerException ex) {
            assertEquals("forDate is null", ex.getMessage());
        }
    }

}