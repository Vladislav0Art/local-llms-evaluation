package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTForYearBetween1950And1986Test {

    @Test
    public void estimate_DeltaTForYearBetween1950And1986Test() {
        LocalDate forDate = LocalDate.of(1975, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(45.45, result, 0.001);
    }

}