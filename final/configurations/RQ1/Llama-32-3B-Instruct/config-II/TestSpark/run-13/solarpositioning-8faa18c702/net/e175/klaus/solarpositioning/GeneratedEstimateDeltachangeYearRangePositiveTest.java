package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltachangeYearRangePositiveTest {

    @Test
    public void estimateDeltachangeYearRangePositiveTest() {
        LocalDate date = LocalDate.of(-3000, 12, 31);
        double expectedValue = -40 + (60 * 25) / 100;
        assertEquals(expectedValue, DeltaT.estimate(date), 0.01);
    }

}