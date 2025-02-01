package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1700And1800Test {

    @Test
    public void estimateYearBetween1700And1800Test() {
        LocalDate date = LocalDate.of(1750, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(13.13, deltaT, 0.01);
    }

}