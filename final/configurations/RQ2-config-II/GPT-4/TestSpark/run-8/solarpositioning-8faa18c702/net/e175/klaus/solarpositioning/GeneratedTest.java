package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void estimateFutureDateTest() {
        final LocalDate forDate = LocalDate.of(2050, 12, 31);
        double result = DeltaT.estimate(forDate);
        assertNotNull("Delta T estimate should be not null for future date", result);
    }

    @Test
    public void estimateCurrentDateTest() {
        final LocalDate forDate = LocalDate.now();
        double result = DeltaT.estimate(forDate);
        assertNotNull("DeltaT estimate should be not null for the current date", result);
    }

    @Test
    public void estimatePastDateTest() {
        final LocalDate forDate = LocalDate.of(1950, 12, 31);
        double result = DeltaT.estimate(forDate);
        assertNotNull("Delta T estimate should be not null for past date", result);
    }

    @Test
    public void estimateNullDateTest() {
        final LocalDate forDate = null;
        double result = DeltaT.estimate(forDate);
    }

}