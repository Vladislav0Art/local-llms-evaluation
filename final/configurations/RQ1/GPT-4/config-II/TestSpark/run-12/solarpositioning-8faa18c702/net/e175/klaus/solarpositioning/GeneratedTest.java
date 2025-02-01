package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateYearLessThanNegative500Test() {
        LocalDate date = LocalDate.of(-501, 1, 1);
        Assert.assertEquals(7958.72, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan500Test() {
        LocalDate date = LocalDate.of(400, 12, 31);
        Assert.assertEquals(14403.5872544, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan1600Test() {
        LocalDate date = LocalDate.of(1550, 12, 31);
        Assert.assertEquals(-238.64470448, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan1700Test() {
        LocalDate date = LocalDate.of(1650, 12, 31);
        Assert.assertEquals(10.87883134, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan1800Test() {
        LocalDate date = LocalDate.of(1750, 12, 31);
        Assert.assertEquals(13.42753096, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan1860Test() {
        LocalDate date = LocalDate.of(1850, 12, 31);
        Assert.assertEquals(7.57817818, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan1900Test() {
        LocalDate date = LocalDate.of(1890, 12, 31);
        Assert.assertEquals(-2.60039770, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan1920Test() {
        LocalDate date = LocalDate.of(1915, 6, 30);
        Assert.assertEquals(15.84690840, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan1941Test() {
        LocalDate date = LocalDate.of(1940, 12, 31);
        Assert.assertEquals(26.14274632, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan1961Test() {
        LocalDate date = LocalDate.of(1955, 6, 30);
        Assert.assertEquals(30.78575531, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan1986Test() {
        LocalDate date = LocalDate.of(1985, 12, 31);
        Assert.assertEquals(53.21430012, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan2005Test() {
        LocalDate date = LocalDate.of(2000, 12, 31);
        Assert.assertEquals(64.96892847, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan2050Test() {
        LocalDate date = LocalDate.of(2045, 12, 31);
        Assert.assertEquals(74.73155891, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearLessThan2150Test() {
        LocalDate date = LocalDate.of(2145, 12, 31);
        Assert.assertEquals(413.83972992, DeltaT.estimate(date), 0.00001);
    }

    @Test
    public void estimateYearGreaterThan2150Test() {
        LocalDate date = LocalDate.of(2151, 12, 31);
        Assert.assertEquals(426.21875, DeltaT.estimate(date), 0.00001);
    }

}