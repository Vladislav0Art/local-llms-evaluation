package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void estimateYearLessThanMinus500Test() {
        assertEquals(-759.84, DeltaT.estimate(LocalDate.of(-1000, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetweenMinus500And500Test() {
        assertEquals(9104.452, DeltaT.estimate(LocalDate.of(0, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween500And1600Test() {
        assertEquals(1302.593, DeltaT.estimate(LocalDate.of(1500, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween1600And1700Test() {
        assertEquals(97.316169, DeltaT.estimate(LocalDate.of(1650, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween1700And1800Test() {
        assertEquals(14.571976, DeltaT.estimate(LocalDate.of(1750, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween1800And1860Test() {
        assertEquals(10.970228, DeltaT.estimate(LocalDate.of(1830, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween1860And1900Test() {
        assertEquals(6.831491, DeltaT.estimate(LocalDate.of(1880, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween1900And1920Test() {
        assertEquals(6.334620, DeltaT.estimate(LocalDate.of(1910, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween1920And1941Test() {
        assertEquals(23.256024, DeltaT.estimate(LocalDate.of(1930, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween1941And1961Test() {
        assertEquals(33.153014, DeltaT.estimate(LocalDate.of(1950, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween1961And1986Test() {
        assertEquals(54.326546, DeltaT.estimate(LocalDate.of(1975, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween1986And2005Test() {
        assertEquals(66.471081, DeltaT.estimate(LocalDate.of(2000, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween2005And2050Test() {
        assertEquals(67.765541, DeltaT.estimate(LocalDate.of(2030, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearBetween2050And2150Test() {
        assertEquals(29.846231, DeltaT.estimate(LocalDate.of(2100, 1, 1)), 0.001);
    }

    @Test
    public void estimateYearGreaterThan2150Test() {
        assertEquals(450.723, DeltaT.estimate(LocalDate.of(2200, 1, 1)), 0.001);
    }

}