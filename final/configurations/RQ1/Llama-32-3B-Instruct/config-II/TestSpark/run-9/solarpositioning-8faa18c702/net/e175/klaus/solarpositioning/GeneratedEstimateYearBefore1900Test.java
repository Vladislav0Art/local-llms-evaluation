package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1900Test {

    @Test
    public void estimateYearBefore1900Test() {
        LocalDate forDate = LocalDate.of(1850, 1, 1);
        double expectedDeltaT = 7.62;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }

}