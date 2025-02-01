package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1800And1860Test {

    @Test
    public void estimateYearBetween1800And1860Test() {
        LocalDate date = LocalDate.of(1830, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(7.72, deltaT, 0.01);
    }

}