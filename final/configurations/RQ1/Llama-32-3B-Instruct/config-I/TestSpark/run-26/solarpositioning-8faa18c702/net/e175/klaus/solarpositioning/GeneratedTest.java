package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTest {

    @Test
    public void estimateDeltaTRemovedFromRecentCenturyTest() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow((date.getYear() - 1820) / 100, 2), result);
    }

    @Test
    public void estimateDeltaTNotRemovedFromRecentCenturyTest() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow((date.getYear() - 1820) / 100, 2), result);
    }

    @Test
    public void estimateDeltaTSkipCenturyBoundaryTest() {
        LocalDate date = LocalDate.of(2021, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow((date.getYear() - 1820) / 100, 2), result);
    }

    @Test
    public void estimateDeltaTCloseToRecentCenturyBoundaryTest() {
        LocalDate date = LocalDate.of(2023, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow((date.getYear() - 1820) / 100, 2), result);
    }

    @Test
    public void estimateDeltaTFixMonthValueTest() {
        LocalDate date = LocalDate.of(2023, 10, 1);
        double result = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow((date.getYear() - 1820) / 100, 2), result);
    }

    @Test
    public void estimateDeltaTFixMonthZeroValueTest() {
        LocalDate date = LocalDate.of(2023, 0, 1);
        double result = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow((date.getYear() - 1820) / 100, 2), result);
    }

}