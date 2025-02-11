package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void estimate_1960sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(1955, 1, 1);
        double expectedDeltaT = 29.07;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

    @Test
    public void estimate_1970sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(1970, 1, 1);
        double expectedDeltaT = 45.45;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

    @Test
    public void estimate_1980sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(1985, 1, 1);
        double expectedDeltaT = 63.86;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

    @Test
    public void estimate_1990sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(1990, 1, 1);
        double expectedDeltaT = 73.83;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

    @Test
    public void estimate_2000sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double expectedDeltaT = 63.86;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

    @Test
    public void estimate_2010sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(2015, 1, 1);
        double expectedDeltaT = 69.02;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

    @Test
    public void estimate_2020sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(2025, 1, 1);
        double expectedDeltaT = 73.87;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

    @Test
    public void decimalYear_1900sYear_ReturnsExpectedDecimalYear() {
        LocalDate forDate = LocalDate.of(1950, 1, 1);
        double expectedDecimalYear = 75.25;
        assertEquals(expectedDecimalYear, DeltaT.decimalYear(forDate));
    }

    @Test
    public void decimalYear_2000sYear_ReturnsExpectedDecimalYear() {
        LocalDate forDate = LocalDate.of(2050, 1, 1);
        double expectedDecimalYear = 95.08;
        assertEquals(expectedDecimalYear, DeltaT.decimalYear(forDate));
    }

}