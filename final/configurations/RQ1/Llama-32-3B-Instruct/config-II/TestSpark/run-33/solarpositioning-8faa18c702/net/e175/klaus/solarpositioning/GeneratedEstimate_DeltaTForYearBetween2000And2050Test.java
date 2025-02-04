package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTForYearBetween2000And2050Test {

    @Test
    public void estimate_DeltaTForYearBetween2000And2050Test() {
        LocalDate forDate = LocalDate.of(2025, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(62.92, result, 0.001);
    }

}