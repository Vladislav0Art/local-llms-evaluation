package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedEstimateWithValidDateTest {

    @Test
    public void estimateWithValidDateTest() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        double expected = 69.34;
        double actual = DeltaT.estimate(forDate);
        assertEquals(expected, actual, 0.01);
    }

}