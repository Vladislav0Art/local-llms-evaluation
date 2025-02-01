package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween2050And2150Test {

    @Test
    public void estimateYearBetween2050And2150Test() {
        assertEquals(29.846231, DeltaT.estimate(LocalDate.of(2100, 1, 1)), 0.001);
    }

}