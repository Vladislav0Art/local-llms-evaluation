package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1961And1986Test {

    @Test
    public void estimateYearBetween1961And1986Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1970, 4, 1));
        assertEquals(40.95, deltaT, 0.01);
    }

}