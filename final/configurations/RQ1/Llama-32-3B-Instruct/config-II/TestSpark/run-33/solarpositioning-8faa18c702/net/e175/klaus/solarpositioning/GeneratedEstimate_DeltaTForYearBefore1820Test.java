package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTForYearBefore1820Test {

    @Test
    public void estimate_DeltaTForYearBefore1820Test() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20.0, result, 0.001);
    }

}