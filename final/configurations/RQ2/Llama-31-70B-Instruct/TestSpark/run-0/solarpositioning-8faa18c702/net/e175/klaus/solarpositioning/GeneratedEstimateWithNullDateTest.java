package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedEstimateWithNullDateTest {

    @Test
    public void estimateWithNullDateTest() {
        LocalDate forDate = null;
        double expected = 0.0;
        double actual = DeltaT.estimate(forDate);
        assertEquals(expected, actual, 0.01);
    }

}