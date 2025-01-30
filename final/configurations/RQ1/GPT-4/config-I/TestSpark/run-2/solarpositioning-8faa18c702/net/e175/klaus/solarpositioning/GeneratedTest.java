package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void estimateYearLessThanNegative500Test() {
        LocalDate forDate = LocalDate.of(-501, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT < 0);
    }

    @Test
    public void estimateYearInRangeNegative500To500Test() {
        LocalDate forDate = LocalDate.of(499, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 5000);
    }

    @Test
    public void estimateYearInRange500To1600Test() {
        LocalDate forDate = LocalDate.of(1500, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 5000);
    }

    @Test
    public void estimateYearInRange1600To1700Test() {
        LocalDate forDate = LocalDate.of(1650, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 50);
    }

    @Test
    public void estimateYearInRange1700To1800Test() {
        LocalDate forDate = LocalDate.of(1750, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearInRange1800To1860Test() {
        LocalDate forDate = LocalDate.of(1850, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearInRange1860To1900Test() {
        LocalDate forDate = LocalDate.of(1890, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearInRange1900To1920Test() {
        LocalDate forDate = LocalDate.of(1910, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 0);
    }

    @Test
    public void estimateYearInRange1920To1941Test() {
        LocalDate forDate = LocalDate.of(1930, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 21);
    }

    @Test
    public void estimateYearInRange1941To1961Test() {
        LocalDate forDate = LocalDate.of(1950, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 29);
    }

    @Test
    public void estimateYearInRange1961To1986Test() {
        LocalDate forDate = LocalDate.of(1980, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 45);
    }

    @Test
    public void estimateYearInRangeFrom1986to2005Test() {
        LocalDate forDate = LocalDate.of(1995, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 60);
    }

    @Test
    public void estimateYearInRangeFrom2005to2050Test() {
        LocalDate forDate = LocalDate.of(2030, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 70);
    }

    @Test
    public void estimateYearInRangeFrom2050to2150Test() {
        LocalDate forDate = LocalDate.of(2100, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > -20);
    }

    @Test
    public void estimateYearGreaterthan2150Test() {
        LocalDate forDate = LocalDate.of(2200, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 0);
    }

}