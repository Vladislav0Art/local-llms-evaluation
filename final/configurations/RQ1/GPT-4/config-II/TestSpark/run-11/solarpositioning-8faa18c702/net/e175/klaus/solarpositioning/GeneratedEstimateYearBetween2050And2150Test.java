package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween2050And2150Test {

    @Test
    public void estimateYearBetween2050And2150Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(2100, 10, 15));
        assertEquals(93.32, deltaT, 0.01);
    }

}