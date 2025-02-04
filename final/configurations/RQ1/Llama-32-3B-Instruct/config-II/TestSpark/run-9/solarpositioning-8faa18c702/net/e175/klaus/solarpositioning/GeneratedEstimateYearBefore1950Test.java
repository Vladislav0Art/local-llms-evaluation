package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1950Test {

    @Test
    public void estimateYearBefore1950Test() {
        LocalDate forDate = LocalDate.of(1949, 1, 1);
        double expectedDeltaT = 29.07;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }

}