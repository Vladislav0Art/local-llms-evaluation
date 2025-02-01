package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateYearLessThanMinus500Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(-500, 10, 31));
        assertEquals(-685.0, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetweenMinus500And500Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(0, 12, 31));
        assertEquals(2219.43, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween500And1600Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1500, 1, 1));
        assertEquals(4251.01, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween1600And1700Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1650, 7, 23));
        assertEquals(77.84, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween1700And1800Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1750, 12, 12));
        assertEquals(13.67, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween1800And1860Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1850, 6, 30));
        assertEquals(7.84, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween1860And1900Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1880, 9, 10));
        assertEquals(1.88, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween1900And1920Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1910, 4, 15));
        assertEquals(13.37, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween1920And1941Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1930, 2, 6));
        assertEquals(24.23, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween1941And1961Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1950, 11, 20));
        assertEquals(29.28, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween1961And1986Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1970, 4, 1));
        assertEquals(40.95, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween1986And2005Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1990, 7, 16));
        assertEquals(57.76, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween2005And2050Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(2020, 3, 20));
        assertEquals(70.59, deltaT, 0.01);
    }

    @Test
    public void estimateYearBetween2050And2150Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(2100, 10, 15));
        assertEquals(93.32, deltaT, 0.01);
    }

    @Test
    public void estimateYearGreaterThan2150Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(2200, 5, 31));
        assertEquals(418.39, deltaT, 0.01);
    }

}