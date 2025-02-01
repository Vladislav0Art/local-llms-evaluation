package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearGreaterThanOrEqualTo2150Test {

    @Test
    public void estimateYearGreaterThanOrEqualTo2150Test() {
        LocalDate date = LocalDate.of(2200, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(581.88, deltaT, 0.01);
    }

}