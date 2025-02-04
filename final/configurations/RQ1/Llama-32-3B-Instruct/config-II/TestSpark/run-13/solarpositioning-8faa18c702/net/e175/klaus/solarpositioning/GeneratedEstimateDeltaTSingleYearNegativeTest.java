package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTSingleYearNegativeTest {

    @Test
    public void estimateDeltaTSingleYearNegativeTest() {
        LocalDate date = LocalDate.of(-3000, 12, 31);
        double expectedValue = -40;
        assertEquals(expectedValue, DeltaT.estimate(date), 0.01);
    }

}