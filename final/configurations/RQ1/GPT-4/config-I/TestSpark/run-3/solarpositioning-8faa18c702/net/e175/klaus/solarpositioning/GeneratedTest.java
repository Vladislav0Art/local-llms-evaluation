package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateBeforeMinus500Test() {
        LocalDate date = LocalDate.of(-999, 1, 1);
        assertEquals(-1969.0, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithinMinus500And500Test() {
        LocalDate date = LocalDate.of(100, 1, 1);
        assertEquals(12435.912347912367, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin500And1600Test() {
        LocalDate date = LocalDate.of(1500, 1, 1);
        assertEquals(4165.399323160548, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin1600And1700Test() {
        LocalDate date = LocalDate.of(1650, 1, 1);
        assertEquals(62.61728395061729, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin1700And1800Test() {
        LocalDate date = LocalDate.of(1750, 1, 1);
        assertEquals(9.88437948212523, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin1800And1860Test() {
        LocalDate date = LocalDate.of(1850, 1, 1);
        assertEquals(20.310177036844294, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin1860And1900Test() {
        LocalDate date = LocalDate.of(1880, 1, 1);
        assertEquals(14.32509831262545, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin1900And1920Test() {
        LocalDate date = LocalDate.of(1910, 1, 1);
        assertEquals(20.100785987094967, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin1920And1941Test() {
        LocalDate date = LocalDate.of(1930, 1, 1);
        assertEquals(27.843396589656904, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin1941And1961Test() {
        LocalDate date = LocalDate.of(1950, 1, 1);
        assertEquals(29.362962962962962, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin1961And1986Test() {
        LocalDate date = LocalDate.of(1975, 1, 1);
        assertEquals(4.373205741626798, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin1986And2005Test() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        assertEquals(63.863262377850164, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin2005And2050Test() {
        LocalDate date = LocalDate.of(2030, 1, 1);
        assertEquals(70.24039999999999, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateWithin2050And2150Test() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        assertEquals(20.761262964666666, DeltaT.estimate(date), DELTA);
    }

    @Test
    public void estimateAfter2150Test() {
        LocalDate date = LocalDate.of(2200, 1, 1);
        assertEquals(153.0, DeltaT.estimate(date), DELTA);
    }

}