package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1941And1961Test {

    @Test
    public void estimateYearBetween1941And1961Test() {
        LocalDate date = LocalDate.of(1950, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(29.07, deltaT, 0.01);
    }

}