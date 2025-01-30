package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void estimateYearLessThanMinus500Test() {
        LocalDate date = LocalDate.of(-1000, 6, 24);
        double result = DeltaT.estimate(date);
        assertTrue(result <= -20);
    }

    @Test
    public void estimateYearLessThan500Test() {
        LocalDate date = LocalDate.of(499, 12, 31);
        double result = DeltaT.estimate(date);
        assertTrue(result > 10500);
    }

    @Test
    public void estimateYearLessThan1600Test() {
        LocalDate date = LocalDate.of(1500, 7, 15);
        double result = DeltaT.estimate(date);
        assertTrue(result > 1500);
    }

    @Test
    public void estimateYearLessThan1700Test() {
        LocalDate date = LocalDate.of(1650, 1, 1);
        double result = DeltaT.estimate(date);
        assertTrue(result > 100);
    }

    @Test
    public void estimateYearLessThan1800Test() {
        LocalDate date = LocalDate.of(1701, 2, 15);
        double result = DeltaT.estimate(date);
        assertTrue(result > 10);
    }

    @Test
    public void estimateYearLessThan1860Test() {
        LocalDate date = LocalDate.of(1850, 8, 20);
        double result = DeltaT.estimate(date);
        assertTrue(result > 20);
    }

    @Test
    public void estimateYearLessThan1900Test() {
        LocalDate date = LocalDate.of(1890, 10, 31);
        double result = DeltaT.estimate(date);
        assertTrue(result > 10);
    }

    @Test
    public void estimateYearLessThan1920Test() {
        LocalDate date = LocalDate.of(1910, 9, 5);
        double result = DeltaT.estimate(date);
        assertTrue(result > 10);
    }

    @Test
    public void estimateYearLessThan1941Test() {
        LocalDate date = LocalDate.of(1930, 12, 12);
        double result = DeltaT.estimate(date);
        assertTrue(result > 27);
    }

    @Test
    public void estimateYearLessThan1961Test() {
        LocalDate date = LocalDate.of(1956, 11, 1);
        double result = DeltaT.estimate(date);
        assertTrue(result > 31);
    }

    @Test
    public void estimateYearLessThan1986Test() {
        LocalDate date = LocalDate.of(1980, 6, 5);
        double result = DeltaT.estimate(date);
        assertTrue(result > 52);
    }

    @Test
    public void estimateYearLessThan2005Test() {
        LocalDate date = LocalDate.of(2000, 12, 31);
        double result = DeltaT.estimate(date);
        assertTrue(result > 63);
    }

    @Test
    public void estimateYearLessThan2050Test() {
        LocalDate date = LocalDate.of(2049, 12, 31);
        double result = DeltaT.estimate(date);
        assertTrue(result > 67);
    }

    @Test
    public void estimateYearLessThan2150Test() {
        LocalDate date = LocalDate.of(2120, 1, 1);
        double result = DeltaT.estimate(date);
        assertTrue(result > 70);
    }

    @Test
    public void estimateYearGreaterThan2150Test() {
        LocalDate date = LocalDate.of(2500, 12, 31);
        double result = DeltaT.estimate(date);
        assertTrue(result > 150);
    }

    @Test
    public void decimalYearTest() {
        LocalDate date = LocalDate.of(1990, 10, 1);
        double result = DeltaT.estimate(date);
        assertTrue(result > 57);
    }

}