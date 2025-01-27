package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateEmptyDateTest {

    @Test
    public void estimateEmptyDateTest() {
        assertEquals(-9999999, (double) DeltaT.estimate(null));
    }

}