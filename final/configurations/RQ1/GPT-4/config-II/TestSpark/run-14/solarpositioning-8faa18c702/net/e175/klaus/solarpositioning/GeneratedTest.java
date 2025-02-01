package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedTest {

    @Test
    public void estimateYearLessThanNegative500Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(-600, 6, 15));
        assertTrue(deltaT < 0);
    }

    @Test
    public void estimateYearLessThan500Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(400, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan1600Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1500, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan1700Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1650, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan1800Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1750, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan1860Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1850, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan1900Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1890, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan1920Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1910, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan1941Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1940, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan1961Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1960, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan1986Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1985, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan2005Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2000, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan2050Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2049, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearLessThan2150Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2100, 6, 15));
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearMoreThan2150Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2200, 6, 15));
        assertTrue(deltaT > 0);
    }

}