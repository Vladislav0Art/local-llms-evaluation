package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimate_DeltaTForYearBefore1820Test() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20.0, result, 0.001);
    }

    @Test
    public void estimate_DeltaTForYearBetween1820And500Test() {
        LocalDate forDate = LocalDate.of(1825, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(32.0, result, 0.001);
    }

    @Test
    public void estimate_DeltaTForYearBetween1000And1600Test() {
        LocalDate forDate = LocalDate.of(1550, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(71.23472, result, 0.001);
    }

    @Test
    public void estimate_DeltaTForYearBetween1700And1800Test() {
        LocalDate forDate = LocalDate.of(1750, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.79, result, 0.001);
    }

    @Test
    public void estimate_DeltaTForYearBetween1950And1986Test() {
        LocalDate forDate = LocalDate.of(1975, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(45.45, result, 0.001);
    }

    @Test
    public void estimate_DeltaTForYearBetween2000And2050Test() {
        LocalDate forDate = LocalDate.of(2025, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(62.92, result, 0.001);
    }

    @Test
    public void estimate_DeltaTForYearBetween1820And2150Test() {
        LocalDate forDate = LocalDate.of(2125, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20.0, result, 0.001);
    }

}

public class DeltaT {

    public static double estimate(final LocalDate forDate) {
        final double year = decimalYear(forDate);
        final double deltaT;

        if (year < -500) {
            double u = (year - 1820) / 100;
            deltaT = -20 + 32 * pow(u, 2) - 0.5628 * (2150 - year);
        } else {
            double u = (year - 1820) / 100;
            deltaT = -20 + 32 * pow(u, 2);
        }

        return deltaT;
    }

    private static double decimalYear(LocalDate forDate) {
        return forDate.getYear() + (forDate.getMonthValue() - 0.5) / 12;
    }

}