package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween500ADAnd1600ADTest {

    @Test
    public void estimateYearBetween500ADAnd1600ADTest() {
        LocalDate date = LocalDate.of(1000, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(1595.8, deltaT, 0.01);
    }

}