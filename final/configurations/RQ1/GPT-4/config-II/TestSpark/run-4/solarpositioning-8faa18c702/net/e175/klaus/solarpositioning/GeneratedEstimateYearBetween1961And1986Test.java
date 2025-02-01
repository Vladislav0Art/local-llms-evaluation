package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1961And1986Test {

    @Test
    public void estimateYearBetween1961And1986Test() {
        LocalDate date = LocalDate.of(1975, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(45.45, deltaT, 0.01);
    }

}