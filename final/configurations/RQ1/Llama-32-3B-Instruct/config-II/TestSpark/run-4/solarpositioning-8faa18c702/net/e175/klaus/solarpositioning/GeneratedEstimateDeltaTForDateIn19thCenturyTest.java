package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTForDateIn19thCenturyTest {

    @Test
    public void estimateDeltaTForDateIn19thCenturyTest() {
        LocalDate date = LocalDate.of(1856, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(-2.79, estimatedDeltaT, 0.01);
    }

}