package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedTest {

    @Test
    public void estimateForToday() {
        LocalDate today = LocalDate.now();
        double result = DeltaT.estimate(today);
        assertNotNull(result);
    }

    @Test
    public void estimateForYesterday() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        double result = DeltaT.estimate(yesterday);
        assertNotNull(result);
    }

    @Test
    public void estimateForTomorrow() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        double result = DeltaT.estimate(tomorrow);
        assertNotNull(result);
    }

    @Test
    public void estimateBeforeFirstDayOfYear() {
        LocalDate beforeFirstDayOfYear = LocalDate.of(2022, 12, 26).minusDays(1);
        double result = DeltaT.estimate(beforeFirstDayOfYear);
        double expected = -1.0 / 14400.0;
        assertEquals(expected, result, 1e-9);
    }

    @Test
    public void estimateAfterLastDayOfYear() {
        LocalDate afterLastDayOfYear = LocalDate.of(2022, 12, 31).plusDays(1);
        double result = DeltaT.estimate(afterLastDayOfYear);
        assertEquals(0.0, result, 1e-9);
    }

    @Test
    public void estimateAtEquinox() {
        LocalDate equinox = LocalDate.of(2022, 3, 20);
        double result = DeltaT.estimate(equinox);
        assertNotNull(result);
    }

    @Test
    public void estimateWhenDayLengthIsZero() {
        LocalDate dayLengthZero = LocalDate.of(2022, 12, 21);
        double result = DeltaT.estimate(dayLengthZero);
        assertEquals(-1.0 / 14400.0, result, 1e-9);
    }

    @Test
    public void estimateIsNegativeWhenBeforeEquinox() {
        LocalDate beforeEquinox = LocalDate.of(2022, 12, 15);
        double result = DeltaT.estimate(beforeEquinox);
        assertTrue(result < 0);
    }

}