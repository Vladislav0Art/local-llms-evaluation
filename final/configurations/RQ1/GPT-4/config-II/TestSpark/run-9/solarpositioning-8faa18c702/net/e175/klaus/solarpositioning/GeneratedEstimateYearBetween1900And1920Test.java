package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1900And1920Test {

    @Test
    public void estimateYearBetween1900And1920Test() {
        assertEquals(6.334620, DeltaT.estimate(LocalDate.of(1910, 1, 1)), 0.001);
    }

}