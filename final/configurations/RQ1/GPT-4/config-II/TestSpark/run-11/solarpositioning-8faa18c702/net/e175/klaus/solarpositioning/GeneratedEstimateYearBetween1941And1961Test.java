package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1941And1961Test {

    @Test
    public void estimateYearBetween1941And1961Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1950, 11, 20));
        assertEquals(29.28, deltaT, 0.01);
    }

}