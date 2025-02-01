package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1860And1900Test {

    @Test
    public void estimateYearBetween1860And1900Test() {
        assertEquals(6.831491, DeltaT.estimate(LocalDate.of(1880, 1, 1)), 0.001);
    }

}