package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTForDateIn2000sTest {

    @Test
    public void estimateDeltaTForDateIn2000sTest() {
        LocalDate date = LocalDate.of(2025, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(62.92, estimatedDeltaT, 0.01);
    }

}