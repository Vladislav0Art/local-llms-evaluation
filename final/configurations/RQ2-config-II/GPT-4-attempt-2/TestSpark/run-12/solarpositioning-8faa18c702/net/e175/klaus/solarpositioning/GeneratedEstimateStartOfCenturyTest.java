package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateStartOfCenturyTest {

    private static final double DELTA = 0.001;

    @Test
    public void estimateStartOfCenturyTest() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        double expected = 63.8285;
        assertEquals(expected, DeltaT.estimate(date), DELTA);
    }

}