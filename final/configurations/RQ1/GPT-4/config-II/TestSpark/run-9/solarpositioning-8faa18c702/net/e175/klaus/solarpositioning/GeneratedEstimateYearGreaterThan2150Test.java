package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearGreaterThan2150Test {

    @Test
    public void estimateYearGreaterThan2150Test() {
        assertEquals(450.723, DeltaT.estimate(LocalDate.of(2200, 1, 1)), 0.001);
    }

}