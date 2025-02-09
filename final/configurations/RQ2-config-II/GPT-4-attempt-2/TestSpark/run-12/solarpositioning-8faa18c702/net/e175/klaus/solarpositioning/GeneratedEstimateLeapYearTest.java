package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateLeapYearTest {

    private static final double DELTA = 0.001;

    @Test
    public void estimateLeapYearTest() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        double expected = 72.9583;
        assertEquals(expected, DeltaT.estimate(date), DELTA);
    }

}