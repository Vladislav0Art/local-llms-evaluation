package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateDeltaTLowYearLowDateTest() {
        LocalDate forDate = LocalDate.of(-500, 1, 1);
        assertEquals(0.2, net.e175.klaus.solarpositioning.DeltaT.estimate(forDate), 0.01);
    }

    @Test
    public void estimateDeltaTMidYearMidDateTest() {
        LocalDate forDate = LocalDate.of(1000, 6, 1);
        assertEquals(0.0, net.e175.klaus.solarpositioning.DeltaT.estimate(forDate), 0.01);
    }

    @Test
    public void estimateDeltaTHighYearHighDateTest() {
        LocalDate forDate = LocalDate.of(2150, 11, 1);
        assertEquals(-19.8, net.e175.klaus.solarpositioning.DeltaT.estimate(forDate), 0.01);
    }

    @Test
    public void estimateDeltaTInvalidYearLowDateTest() {
        LocalDate forDate = LocalDate.of(500, 12, 31);
        assertEquals(Double.NaN, net.e175.klaus.solarpositioning.DeltaT.estimate(forDate));
    }

    @Test
    public void testDecimalYearLowMonthLowDayTest() {
        LocalDate forDate = LocalDate.of(-500, 1, 1);
        assertEquals(0.2, net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate), 0.01);
    }

    @Test
    public void testDecimalYearMidMonthMidDayTest() {
        LocalDate forDate = LocalDate.of(1000, 6, 1);
        assertEquals(10.5, net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate), 0.01);
    }

    @Test
    public void testDecimalYearHighMonthHighDayTest() {
        LocalDate forDate = LocalDate.of(2150, 11, 1);
        assertEquals(-19.8, net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate), 0.01);
    }

    @Test
    public void testDecimalYearInvalidMonthLowDayTest() {
        LocalDate forDate = LocalDate.of(500, 12, 32);
        assertEquals(Double.NaN, net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate));
    }

}