package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTLowYearLowDateTest {

    @Test
    public void estimateDeltaTLowYearLowDateTest() {
        LocalDate forDate = LocalDate.of(-500, 1, 1);
        assertEquals(0.2, net.e175.klaus.solarpositioning.DeltaT.estimate(forDate), 0.01);
    }

}