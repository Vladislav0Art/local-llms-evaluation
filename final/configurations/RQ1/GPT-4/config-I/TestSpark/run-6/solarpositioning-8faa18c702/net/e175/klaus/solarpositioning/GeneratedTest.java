package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateYearLowerThanMinus500Test() {
        LocalDate date = LocalDate.of(-601, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(-464.39456, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan500Test() {
        LocalDate date = LocalDate.of(-499, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(10723.45224, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan1600Test() {
        LocalDate date = LocalDate.of(500, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(1614.6645672, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan1700Test() {
        LocalDate date = LocalDate.of(1600, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(121.81945766678516, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan1800Test() {
        LocalDate date = LocalDate.of(1700, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(10.249299146908999, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan1860Test() {
        LocalDate date = LocalDate.of(1800, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(14.674321059004996, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan1900Test() {
        LocalDate date = LocalDate.of(1860, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(7.759775591647688, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan1920Test() {
        LocalDate date = LocalDate.of(1900, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(-1.71909589165456, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan1941Test() {
        LocalDate date = LocalDate.of(1920, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(21.50531878, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan1961Test() {
        LocalDate date = LocalDate.of(1941, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(27.8943597561, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan1986Test() {
        LocalDate date = LocalDate.of(1961, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(37.28128, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan2005Test() {
        LocalDate date = LocalDate.of(1986, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(59.11580425242563, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan2050Test() {
        LocalDate date = LocalDate.of(2005, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(68.739392125, result, 0.0);
    }

    @Test
    public void estimateYearLowerThan2150Test() {
        LocalDate date = LocalDate.of(2050, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(68.342255, result, 0.0);
    }

    @Test
    public void estimateYearHigherThan2150Test() {
        LocalDate date = LocalDate.of(2151, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(101.7059078432, result, 0.0);
    }

}