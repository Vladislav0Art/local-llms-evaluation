package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1920And1941Test {

    @Test
    public void estimateYearBetween1920And1941Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1930, 2, 6));
        assertEquals(24.23, deltaT, 0.01);
    }

}