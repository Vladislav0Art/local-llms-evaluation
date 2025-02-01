package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearGreaterThan2150Test {

    @Test
    public void estimateYearGreaterThan2150Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(2200, 5, 31));
        assertEquals(418.39, deltaT, 0.01);
    }

}