package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1600And1700Test {

    @Test
    public void estimateYearBetween1600And1700Test() {
        assertEquals(97.316169, DeltaT.estimate(LocalDate.of(1650, 1, 1)), 0.001);
    }

}