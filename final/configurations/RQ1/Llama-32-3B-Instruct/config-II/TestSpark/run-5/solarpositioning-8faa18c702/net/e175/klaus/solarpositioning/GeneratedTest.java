package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimate_DeltaTEarlyYearsReturnsCorrectDeltaTSingleValue() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20.0, estimatedDeltaT, 0.00001);
    }

    @Test
    public void estimate_MidRangeYearsReturnsCorrectDeltaTSingleValue() {
        LocalDate forDate = LocalDate.of(1850, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20.0, estimatedDeltaT, 0.00001);
    }

    @Test
    public void estimate_LateYearsReturnsCorrectDeltaTSingleValue() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20.0, estimatedDeltaT, 0.00001);
    }

    @Test
    public void estimate_EarlyYearsReturnsCorrectDeltaTSingleValue() {
        LocalDate forDate = LocalDate.of(1720, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20.0, estimatedDeltaT, 0.00001);
    }

    @Test
    public void estimate_DifferentYearsReturnsSameDeltaT() {
        LocalDate forDate1 = LocalDate.of(1800, 1, 1);
        LocalDate forDate2 = LocalDate.of(1810, 1, 1);
        double estimatedDeltaT1 = DeltaT.estimate(forDate1);
        double estimatedDeltaT2 = DeltaT.estimate(forDate2);
        assertEquals(estimatedDeltaT1, estimatedDeltaT2, 0.00001);
    }

    @Test
    public void decimalYear_SingleValueReturnsCorrectDecimalYear() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double calculatedDecimalYear = DeltaT.decimalYear(forDate);
        assertEquals(1809.416666667, calculatedDecimalYear, 0.00001);
    }

}