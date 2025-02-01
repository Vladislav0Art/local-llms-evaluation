package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1600And1700Test {

    @Test
    public void estimateYearBetween1600And1700Test() {
        LocalDate date = LocalDate.of(1650, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(49.4, deltaT, 0.01);
    }

}