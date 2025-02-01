package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween500And1600Test {

    @Test
    public void estimateYearBetween500And1600Test() {
        assertEquals(1302.593, DeltaT.estimate(LocalDate.of(1500, 1, 1)), 0.001);
    }

}