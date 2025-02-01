package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1800And1860Test {

    @Test
    public void estimateYearBetween1800And1860Test() {
        assertEquals(10.970228, DeltaT.estimate(LocalDate.of(1830, 1, 1)), 0.001);
    }

}