package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void estimateEmptyDateRange

    Test() {
        LocalDate forDate = null;
        double result = DeltaT.estimate(forDate);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void estimateSameDayDifferentYears

    Test() {
        LocalDate forDate1 = LocalDate.of(2022, 1, 1);
        LocalDate forDate2 = LocalDate.of(2023, 1, 1);
        double result = DeltaT.estimate(forDate1);
        assertEquals(-0.0027259202931020436, result, 0.000001);
    }

    @Test
    public void estimateSameDayDifferentMonths

    Test() {
        LocalDate forDate1 = LocalDate.of(2022, 1, 1);
        LocalDate forDate2 = LocalDate.of(2022, 12, 1);
        double result = DeltaT.estimate(forDate1);
        assertEquals(-0.0027259202931020436, result, 0.000001);
    }

    @Test
    public void estimateSameDayDifferentDays

    Test() {
        LocalDate forDate1 = LocalDate.of(2022, 1, 1);
        LocalDate forDate2 = LocalDate.of(2022, 1, 31);
        double result = DeltaT.estimate(forDate1);
        assertEquals(-0.0027259202931020436, result, 0.000001);
    }

    @Test
    public void estimateSameDay

    SameDay Test() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-0.0027259202931020436, result, 0.000001);
    }

    @Test
    public void estimateSameMonth

    SameMonth Test() {
        LocalDate forDate1 = LocalDate.of(2022, 1, 1);
        LocalDate forDate2 = LocalDate.of(2023, 1, 1);
        double result = DeltaT.estimate(forDate1);
        assertEquals(-0.0027259202931020436, result, 0.000001);
    }

    @Test
    public void estimateSameYear

    SameYear Test() {
        LocalDate forDate1 = LocalDate.of(2022, 1, 1);
        LocalDate forDate2 = LocalDate.of(2023, 1, 1);
        double result = DeltaT.estimate(forDate1);
        assertEquals(-0.0027259202931020436, result, 0.000001);
    }

    @Test
    public void estimateBeforeStartOfMonth

    Test() {
        LocalDate forDate = LocalDate.of(2022, 1, 15);
        double result = DeltaT.estimate(forDate);
        assertFalse(Double.isNaN(result));
    }

    @Test
    public void estimateAfterEndOfMonth

    Test() {
        LocalDate forDate = LocalDate.of(2022, 12, 25);
        double result = DeltaT.estimate(forDate);
        assertFalse(Double.isNaN(result));
    }

    @Test
    public void isLeapYearTest

    Test() {
        LocalDate forDate = LocalDate.of(2024, 1, 1);
        assertTrue(DeltaT.isLeapYear(forDate));
    }

}