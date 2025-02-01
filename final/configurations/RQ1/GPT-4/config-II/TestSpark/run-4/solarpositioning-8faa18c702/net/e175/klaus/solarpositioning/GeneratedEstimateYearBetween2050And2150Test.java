package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween2050And2150Test {

    @Test
    public void estimateYearBetween2050And2150Test() {
        LocalDate date = LocalDate.of(2100, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(240.97, deltaT, 0.01);
    }

}