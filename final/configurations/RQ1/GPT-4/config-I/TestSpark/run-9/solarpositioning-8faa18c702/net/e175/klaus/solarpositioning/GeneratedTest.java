package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateYearLessThanMinus500Test() {
        LocalDate date = LocalDate.of(-600, 5, 1);
        assertEquals(320.0, DeltaT.estimate(date), 0);
    }

    @Test
    public void estimateYearMinus500To500Test() {
        LocalDate date = LocalDate.of(200, 5, 1);
        assertEquals(21171.581298056853, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear500To1600Test() {
        LocalDate date = LocalDate.of(1495, 5, 1);
        assertEquals(1739.7742863697716, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear1600To1700Test() {
        LocalDate date = LocalDate.of(1650, 5, 1);
        assertEquals(96.48924649132582, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear1700To1800Test() {
        LocalDate date = LocalDate.of(1750, 5, 1);
        assertEquals(19.379900308777902, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear1800To1860Test() {
        LocalDate date = LocalDate.of(1850, 5, 1);
        assertEquals(7.083831082321417, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear1860To1900Test() {
        LocalDate date = LocalDate.of(1885, 5, 1);
        assertEquals(-10.60574579522981, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear1900To1920Test() {
        LocalDate date = LocalDate.of(1910, 5, 1);
        assertEquals(4.020587738411123, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear1920To1941Test() {
        LocalDate date = LocalDate.of(1930, 5, 1);
        assertEquals(13.769129382978723, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear1941To1961Test() {
        LocalDate date = LocalDate.of(1955, 5, 1);
        assertEquals(36.028546382978726, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear1961To1986Test() {
        LocalDate date = LocalDate.of(1970, 5, 1);
        assertEquals(46.92288704147465, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear1986To2005Test() {
        LocalDate date = LocalDate.of(1995, 5, 1);
        assertEquals(72.72678149385337, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear2005To2050Test() {
        LocalDate date = LocalDate.of(2035, 5, 1);
        assertEquals(73.16262854166667, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYear2050To2150Test() {
        LocalDate date = LocalDate.of(2100, 5, 1);
        assertEquals(182.21027851063833, DeltaT.estimate(date), 0.1);
    }

    @Test
    public void estimateYearMoreThan2150Test() {
        LocalDate date = LocalDate.of(2200, 5, 1);
        assertEquals(436.0, DeltaT.estimate(date), 0.1);
    }

}