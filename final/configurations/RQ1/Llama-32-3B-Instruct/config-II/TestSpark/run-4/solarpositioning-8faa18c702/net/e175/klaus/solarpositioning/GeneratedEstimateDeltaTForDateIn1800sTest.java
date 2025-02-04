package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTForDateIn1800sTest {

    @Test
    public void estimateDeltaTForDateIn1800sTest() {
        LocalDate date = LocalDate.of(1823, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(-2.79, estimatedDeltaT, 0.01);
    }

}