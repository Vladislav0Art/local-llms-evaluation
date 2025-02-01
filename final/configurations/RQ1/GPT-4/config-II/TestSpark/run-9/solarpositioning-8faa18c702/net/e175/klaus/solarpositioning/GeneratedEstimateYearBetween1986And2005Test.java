package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1986And2005Test {

    @Test
    public void estimateYearBetween1986And2005Test() {
        assertEquals(66.471081, DeltaT.estimate(LocalDate.of(2000, 1, 1)), 0.001);
    }

}