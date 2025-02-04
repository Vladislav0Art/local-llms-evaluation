package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1975Test {

    @Test
    public void estimateYearBefore1975Test() {
        LocalDate forDate = LocalDate.of(1974, 1, 1);
        double expectedDeltaT = 45.45;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }

}