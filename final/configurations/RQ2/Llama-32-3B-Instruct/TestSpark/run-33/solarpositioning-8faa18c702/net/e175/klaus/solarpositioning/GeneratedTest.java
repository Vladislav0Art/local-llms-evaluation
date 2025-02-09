package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_WhenForDateIsBeforeFirstDayOfYear_ReturnsZero() {
        when(forDate.isAfter(LocalDate.of(2022, 1, 1))).thenReturn(true);
        double result = DeltaT.estimate(forDate);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void estimate_WhenForDateIsFirstDayOfYear_ReturnsNegativeInfinity() {
        when(forDate.isAfter(LocalDate.of(2022, 1, 1))).thenReturn(true);
        double result = DeltaT.estimate(forDate);
        assertNotEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void estimate_WhenForDateIsAfterLastDayOfYear_ReturnsZero() {
        when(forDate.isBefore(LocalDate.of(2023, 1, 1))).thenReturn(true);
        double result = DeltaT.estimate(forDate);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void estimate_WhenForDateIsAfterLastDayOfYear_ReturnsNegativeInfinity() {
        when(forDate.isBefore(LocalDate.of(2023, 1, 1))).thenReturn(true);
        double result = DeltaT.estimate(forDate);
        assertNotEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void estimate_WhenForDateIsOnFirstDayOfYear_ReturnsPositiveInfinity() {
        when(forDate.isAfter(LocalDate.of(2022, 1, 1))).thenReturn(false);
        when(forDate.isBefore(LocalDate.of(2023, 1, 1))).thenReturn(true);
        double result = DeltaT.estimate(forDate);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void estimate_WhenForDateIsOnLastDayOfYear_ReturnsPositiveInfinity() {
        when(forDate.isAfter(LocalDate.of(2022, 1, 1))).thenReturn(true);
        when(forDate.isBefore(LocalDate.of(2023, 1, 1))).thenReturn(false);
        double result = DeltaT.estimate(forDate);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void estimate_WhenForDateIsInBetweenFirstAndLastDaysOfYear_ReturnsPositiveInfinity() {
        when(forDate.isAfter(LocalDate.of(2022, 1, 1))).thenReturn(true);
        when(forDate.isBefore(LocalDate.of(2023, 1, 1))).thenReturn(false);
        double result = DeltaT.estimate(forDate);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void estimate_WhenForDateIsInBetweenFirstAndLastDaysOfYear_ReturnsPositiveInfinity() {
        when(forDate.isAfter(LocalDate.of(2022, 1, 1))).thenReturn(true);
        when(forDate.isBefore(LocalDate.of(2023, 1, 1))).thenReturn(false);
        double result = DeltaT.estimate(forDate);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void estimate_WhenForDateIsInBetweenDaysOfYear_ReturnsPositiveInfinity() {
        long daysSinceFirstDayOfYear = ChronoUnit.DAYS.between(LocalDate.of(2022, 1, 1), forDate);
        double result = DeltaT.estimate(forDate);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

}