package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void estimateYearBefore500BCTest() {
        LocalDate forDate = LocalDate.of(-600, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBeforeADTest() {
        LocalDate forDate = LocalDate.of(300, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore1600Test() {
        LocalDate forDate = LocalDate.of(1500, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore1700Test() {
        LocalDate forDate = LocalDate.of(1650, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore1800Test() {
        LocalDate forDate = LocalDate.of(1750, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore1860Test() {
        LocalDate forDate = LocalDate.of(1850, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore1900Test() {
        LocalDate forDate = LocalDate.of(1880, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore1920Test() {
        LocalDate forDate = LocalDate.of(1910, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore1941Test() {
        LocalDate forDate = LocalDate.of(1935, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore1961Test() {
        LocalDate forDate = LocalDate.of(1955, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore1986Test() {
        LocalDate forDate = LocalDate.of(1980, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore2005Test() {
        LocalDate forDate = LocalDate.of(2000, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore2050Test() {
        LocalDate forDate = LocalDate.of(2040, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearBefore2150Test() {
        LocalDate forDate = LocalDate.of(2100, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

    @Test
    public void estimateYearAfter2150Test() {
        LocalDate forDate = LocalDate.of(2200, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

}