package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void estimateWithValidDateTest() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        double expected = 69.34;
        double actual = DeltaT.estimate(forDate);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void estimateWithNullDateTest() {
        LocalDate forDate = null;
        double expected = 0.0;
        double actual = DeltaT.estimate(forDate);
        assertEquals(expected, actual, 0.01);
    }

}