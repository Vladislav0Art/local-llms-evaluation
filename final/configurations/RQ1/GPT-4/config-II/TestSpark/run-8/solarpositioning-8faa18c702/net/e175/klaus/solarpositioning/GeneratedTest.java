package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateNegativeYearTest() {
        LocalDate date = LocalDate.of(-1000, 01, 01);
        double result = DeltaT.estimate(date);
        assertEquals(280.0, result, 0.001);
    }

    @Test
    public void estimateYearBefore500Test() {
        LocalDate date = LocalDate.of(400, 3, 10);
        double result = DeltaT.estimate(date);
        assertEquals(4190.496, result, 0.001);
    }

    @Test
    public void estimateYearBefore1600Test() {
        LocalDate date = LocalDate.of(1500, 4, 15);
        double result = DeltaT.estimate(date);
        assertEquals(8681.993, result, 0.001);
    }

    @Test
    public void estimateYearBefore1700Test() {
        LocalDate date = LocalDate.of(1650, 5, 21);
        double result = DeltaT.estimate(date);
        assertEquals(133.40977564, result, 0.001);
    }

    @Test
    public void estimateYearBefore1800Test() {
        LocalDate date = LocalDate.of(1750, 6, 30);
        double result = DeltaT.estimate(date);
        assertEquals(9.7178395, result, 0.001);
    }

    @Test
    public void estimateYearBefore1860Test() {
        LocalDate date = LocalDate.of(1850, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(18.19597762, result, 0.001);
    }

    @Test
    public void estimateYearBefore1900Test() {
        LocalDate date = LocalDate.of(1880, 9, 20);
        double result = DeltaT.estimate(date);
        assertEquals(15.78030308, result, 0.001);
    }

    @Test
    public void estimateYearBefore1920Test() {
        LocalDate date = LocalDate.of(1910, 10, 30);
        double result = DeltaT.estimate(date);
        assertEquals(6.488209248, result, 0.001);
    }

    @Test
    public void estimateYearBefore1941Test() {
        LocalDate date = LocalDate.of(1930, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(24.1917632, result, 0.001);
    }

    @Test
    public void estimateYearBefore1961Test() {
        LocalDate date = LocalDate.of(1950, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(29.4250, result, 0.001);
    }

    @Test
    public void estimateYearBefore1986Test() {
        LocalDate date = LocalDate.of(1980, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(61.3255, result, 0.001);
    }

    @Test
    public void estimateYearBefore2005Test() {
        LocalDate date = LocalDate.of(2000, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(65.4550011, result, 0.001);
    }

    @Test
    public void estimateYearBefore2050Test() {
        LocalDate date = LocalDate.of(2040, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(76.137978, result, 0.001);
    }

    @Test
    public void estimateYearBefore2150Test() {
        LocalDate date = LocalDate.of(2100, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(80.6356, result, 0.001);
    }

    @Test
    public void estimateYearAfter2150Test() {
        LocalDate date = LocalDate.of(2200, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(244.314493529, result, 0.001);
    }

}