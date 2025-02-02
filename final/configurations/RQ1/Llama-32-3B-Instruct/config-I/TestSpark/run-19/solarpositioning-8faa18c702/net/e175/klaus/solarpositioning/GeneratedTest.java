package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimate_DeltaTForPastYears_ReturnsApproximateValues() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(13.72, estimatedDeltaT, 1e-6);
    }

    @Test
    public void estimate_DeltaTForRecentYears_ReturnsCorrectValues() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(63.86, estimatedDeltaT, 1e-6);
    }

    @Test
    public void estimate_DeltaTForYear1900_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(7.62, estimatedDeltaT, 1e-6);
    }

    @Test
    public void decimalYear_DatesInPastCenturies_ReturnsCorrectValues() {
        LocalDate forDate = LocalDate.of(-500, 1, 1);
        double estimatedDecimalYear = DeltaT.decimalYear(forDate);
        assertEquals(-1000.5, estimatedDecimalYear, 1e-6);
    }

    @Test
    public void decimalYear_DatesInRecentCenturies_ReturnsCorrectValues() {
        LocalDate forDate = LocalDate.of(500, 12, 31);
        double estimatedDecimalYear = DeltaT.decimalYear(forDate);
        assertEquals(52.5, estimatedDecimalYear, 1e-6);
    }

    @Test
    public void estimate_DatesInPastMillennium_ReturnsCorrectValues() {
        LocalDate forDate = LocalDate.of(-1000, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20, estimatedDeltaT, 1e-6);
    }

    @Test
    public void estimate_DatesInRecentMillennium_ReturnsCorrectValues() {
        LocalDate forDate = LocalDate.of(1000, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20, estimatedDeltaT, 1e-6);
    }

}