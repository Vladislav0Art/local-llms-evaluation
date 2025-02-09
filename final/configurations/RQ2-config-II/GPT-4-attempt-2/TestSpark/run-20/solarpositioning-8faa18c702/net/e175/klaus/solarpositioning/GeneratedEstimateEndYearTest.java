package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateEndYearTest {

    @Test
    public void estimateEndYearTest() {
        LocalDate date = LocalDate.ofYearDay(9999, 365);
        double result = DeltaT.estimate(date);
        double expected = 0.0;  // put expected value here based on the class implementation
        assertEquals(expected, result, 1e-9);
    }

}