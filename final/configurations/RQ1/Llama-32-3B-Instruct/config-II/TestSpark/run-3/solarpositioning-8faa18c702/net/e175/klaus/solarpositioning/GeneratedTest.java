package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateDeltaTLowYearLess500() {
        LocalDate forDate = LocalDate.of(-1500, 1, 1);
        assertEquals(-20.0, DeltaT.estimate(forDate), 0.001);
    }

    @Test
    public void estimateDeltaTPeakYears() {
        LocalDate forDate = LocalDate.of(1950, 1, 1);
        assertEquals(63.86, DeltaT.estimate(forDate), 0.001);
    }

    @Test
    public void estimateDeltaTTwoCenturies() {
        LocalDate forDate = LocalDate.of(2200, 1, 1);
        assertEquals(-20.0, DeltaT.estimate(forDate), 0.001);
    }

    @Test
    public void decimalYearCorrectForLowYears() {
        LocalDate forDate = LocalDate.of(-1500, 1, 1);
        assertEquals(120.67, DeltaT.decimalYear(forDate), 0.01);
    }

    @Test
    public void decimalYearCorrectForHighYears() {
        LocalDate forDate = LocalDate.of(2200, 1, 1);
        assertEquals(180.83, DeltaT.decimalYear(forDate), 0.01);
    }

}