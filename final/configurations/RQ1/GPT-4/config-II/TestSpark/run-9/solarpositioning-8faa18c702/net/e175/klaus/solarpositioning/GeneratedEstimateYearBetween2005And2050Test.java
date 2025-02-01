package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween2005And2050Test {

    @Test
    public void estimateYearBetween2005And2050Test() {
        assertEquals(67.765541, DeltaT.estimate(LocalDate.of(2030, 1, 1)), 0.001);
    }

}