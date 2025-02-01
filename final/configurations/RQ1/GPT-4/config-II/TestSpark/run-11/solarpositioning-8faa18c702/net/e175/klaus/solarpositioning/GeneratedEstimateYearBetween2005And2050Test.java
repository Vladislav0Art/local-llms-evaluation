package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween2005And2050Test {

    @Test
    public void estimateYearBetween2005And2050Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(2020, 3, 20));
        assertEquals(70.59, deltaT, 0.01);
    }

}