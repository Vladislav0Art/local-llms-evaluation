package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void estimateYearLessThanNegative500Test() {
        LocalDate forDate = LocalDate.of(-501, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT < 0);
    }

    @Test
    public void estimateYearLessThan500Test() {
        LocalDate forDate = LocalDate.of(499, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(10583.6, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan1600Test() {
        LocalDate forDate = LocalDate.of(1599, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(14676.4, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan1700Test() {
        LocalDate forDate = LocalDate.of(1699, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(120, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan1800Test() {
        LocalDate forDate = LocalDate.of(1799, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(8.83, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan1860Test() {
        LocalDate forDate = LocalDate.of(1859, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(13.72, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan1900Test() {
        LocalDate forDate = LocalDate.of(1899, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(7.62, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan1920Test() {
        LocalDate forDate = LocalDate.of(1919, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(-2.79, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan1941Test() {
        LocalDate forDate = LocalDate.of(1940, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(21.2, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan1961Test() {
        LocalDate forDate = LocalDate.of(1960, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(29.07, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan1986Test() {
        LocalDate forDate = LocalDate.of(1985, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(45.45, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan2005Test() {
        LocalDate forDate = LocalDate.of(2004, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(63.86, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan2050Test() {
        LocalDate forDate = LocalDate.of(2049, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(62.92, deltaT, 0.1);
    }

    @Test
    public void estimateYearLessThan2150Test() {
        LocalDate forDate = LocalDate.of(2149, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT < 0);
    }

    @Test
    public void estimateYearGreaterThan2150Test() {
        LocalDate forDate = LocalDate.of(2151, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 0);
    }

}