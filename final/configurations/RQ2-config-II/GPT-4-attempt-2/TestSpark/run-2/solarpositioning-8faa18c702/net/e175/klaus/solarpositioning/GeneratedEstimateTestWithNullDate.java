package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedEstimateTestWithNullDate {

    @Test
    public void estimateTestWithNullDate() {
        try {
            DeltaT.estimate(null);
            fail("DeltaT.estimate() should have thrown NullPointerException");
        } catch (NullPointerException e) {
            // Test successful.
        }
    }

}