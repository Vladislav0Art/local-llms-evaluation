package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTSingleYearPositiveTest {

    @Test
    public void estimateDeltaTSingleYearPositiveTest() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double expectedValue = 60.45;
        assertEquals(expectedValue, DeltaT.estimate(date), 0.01);
    }

}