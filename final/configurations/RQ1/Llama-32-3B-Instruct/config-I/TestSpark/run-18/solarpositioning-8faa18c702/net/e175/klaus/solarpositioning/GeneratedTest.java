package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateDeltaTForAnyYearIsZero() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(0.0, result);
    }

    @Test
    public void estimateDeltaTForAnyYearIsZeroInPositiveYears() {
        LocalDate forDate = LocalDate.of(1900, 1, 15);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(0.0, result);
    }

    @Test
    public void estimateDeltaTForYearBefore1800ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(-1799, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(13.72, result, 0.01);
    }

    @Test
    public void estimateDeltaTForYearBefore1950ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(-1949, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(29.07, result, 0.01);
    }

    @Test
    public void estimateDeltaTForYearAfter2005ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2006, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(63.86, result, 0.01);
    }

    @Test
    public void estimateDeltaTForYearAfter2150ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2169, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(-20, result);
    }

    @Test
    public void decimalYearForAnyYearIsCorretlyComputed() {
        LocalDate forDate = LocalDate.of(2022, 6, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate);
        assertEquals(45.5, result);
    }

}