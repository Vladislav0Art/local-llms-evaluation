package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateStartYearTest {

    @Test
    public void estimateStartYearTest() {
        LocalDate date = LocalDate.ofYearDay(1, 1);
        double result = DeltaT.estimate(date);
        double expected = 0.0;  // put expected value here based on the class implementation
        assertEquals(expected, result, 1e-9);
    }

}