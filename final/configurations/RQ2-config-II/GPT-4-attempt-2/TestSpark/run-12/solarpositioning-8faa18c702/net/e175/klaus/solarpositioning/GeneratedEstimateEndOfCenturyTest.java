package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateEndOfCenturyTest {

    private static final double DELTA = 0.001;

    @Test
    public void estimateEndOfCenturyTest() {
        LocalDate date = LocalDate.of(2100, 12, 31);
        double expected = 120.3765;
        assertEquals(expected, DeltaT.estimate(date), DELTA);
    }

}