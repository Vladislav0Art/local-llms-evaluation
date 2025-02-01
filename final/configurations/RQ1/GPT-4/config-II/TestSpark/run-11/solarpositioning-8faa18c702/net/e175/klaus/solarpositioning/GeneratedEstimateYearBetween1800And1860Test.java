package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1800And1860Test {

    @Test
    public void estimateYearBetween1800And1860Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1850, 6, 30));
        assertEquals(7.84, deltaT, 0.01);
    }

}