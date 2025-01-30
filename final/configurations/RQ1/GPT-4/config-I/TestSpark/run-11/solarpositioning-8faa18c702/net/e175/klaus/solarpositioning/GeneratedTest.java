package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void estimateYearLessThanMinus500Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(-501, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetweenMinus500And500Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(0, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween500And1600Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1500, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween1600And1700Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1650, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween1700And1800Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1750, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween1800And1860Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1850, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween1860And1900Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1880, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween1900And1920Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1910, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween1920And1941Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1930, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween1941And1961Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1950, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween1961And1986Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1970, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween1986And2005Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1990, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween2005And2050Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2010, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearBetween2050And2150Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2100, 1, 1));
        assertNotNull(deltaT);
    }

    @Test
    public void estimateYearMoreThan2150Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2200, 1, 1));
        assertNotNull(deltaT);
    }

}