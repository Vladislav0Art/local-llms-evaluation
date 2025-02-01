package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1920And1941Test {

    @Test
    public void estimateYearBetween1920And1941Test() {
        LocalDate date = LocalDate.of(1930, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(24.02, deltaT, 0.01);
    }

}