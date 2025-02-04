package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTInvalidYearLowDateTest {

    @Test
    public void estimateDeltaTInvalidYearLowDateTest() {
        LocalDate forDate = LocalDate.of(500, 12, 31);
        assertEquals(Double.NaN, net.e175.klaus.solarpositioning.DeltaT.estimate(forDate));
    }

}