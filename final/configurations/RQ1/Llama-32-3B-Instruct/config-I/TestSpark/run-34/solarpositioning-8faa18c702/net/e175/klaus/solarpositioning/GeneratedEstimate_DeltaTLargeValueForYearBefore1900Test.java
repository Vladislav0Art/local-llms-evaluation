package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTLargeValueForYearBefore1900Test {

    @Test
    public void estimate_DeltaTLargeValueForYearBefore1900Test() {
        LocalDate forDate = LocalDate.of(-500, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(10583.6, estimatedDeltaT, 0.01);
    }

}