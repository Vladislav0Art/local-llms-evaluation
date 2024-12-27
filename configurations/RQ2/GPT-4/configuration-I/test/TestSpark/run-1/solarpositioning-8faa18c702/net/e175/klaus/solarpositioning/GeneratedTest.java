package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateNullDateTest() {
        final double epsilon = 1e-15;
        try {
            DeltaT.estimate(null);
        } catch (NullPointerException e) {
            assertEquals("Expected message when no date is provided", e.getMessage());
        }
    }

    @Test
    public void estimatePastDateTest() {
        final double epsilon = 1e-15;
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals("Expected delta T for past date", result, epsilon);
    }

    @Test
    public void estimateFutureDateTest() {
        final double epsilon = 1e-15;
        LocalDate forDate = LocalDate.of(2030, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals("Expected delta T for future date", result, epsilon);
    }

    @Test
    public void estimatePresentDateTest() {
        final double epsilon = 1e-15;
        LocalDate forDate = LocalDate.now();
        double result = DeltaT.estimate(forDate);
        assertEquals("Expected delta T for present date", result, epsilon);
    }

}