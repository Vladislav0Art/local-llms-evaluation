package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearAfter2005Test {

    @Test
    public void estimateYearAfter2005Test() {
        LocalDate forDate = LocalDate.of(2010, 1, 1);
        double expectedDeltaT = 63.86;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }

}