package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.Math;

public class GeneratedTest {

    @Test
    public void estimateForDate_ReturnsPositiveValue() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= 0);
    }

    @Test
    public void estimateForDate_ReturnsNonNegativeValue() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertFalse(result < 0);
    }

    @Test
    public void estimateNullForDate_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

    @Test
    public void estimateEmptyForDate_ThrowsNullPointerException() {
        LocalDate forDate = LocalDate.of(2022, 1, 0);
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(forDate));
    }

    @Test
    public void estimateForNegativeYear_ReturnsZero() {
        LocalDate forDate = LocalDate.of(-2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(0, result, 0.00001); // Using a tolerance to handle floating-point precision issues.
    }

}