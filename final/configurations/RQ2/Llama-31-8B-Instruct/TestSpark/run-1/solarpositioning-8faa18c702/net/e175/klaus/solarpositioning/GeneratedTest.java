package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static java.lang.Math.pow;

public class GeneratedTest {

    @Test
    public void estimateValidDateTest() {
        LocalDate forDate = LocalDate.of(2022, Month.JANUARY, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void estimateNullDateTest() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

    @Test
    public void estimateFutureDateTest() {
        LocalDate forDate = LocalDate.of(2100, Month.JANUARY, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void estimatePastDateTest() {
        LocalDate forDate = LocalDate.of(1900, Month.JANUARY, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void estimateLeapYearTest() {
        LocalDate forDate = LocalDate.of(2020, Month.FEBRUARY, 29);
        double result = DeltaT.estimate(forDate);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void estimateNonLeapYearTest() {
        LocalDate forDate = LocalDate.of(2021, Month.FEBRUARY, 28);
        double result = DeltaT.estimate(forDate);
        assertEquals(0.0, result, 0.0001);
    }

}