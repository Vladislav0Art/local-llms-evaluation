package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateZeroYearTest {

    @Test
    public void estimateZeroYearTest() {
        LocalDate localDate = LocalDate.of(0, 5, 20);
        double expected = 7243.137;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}