package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void EstimateBefore1986Test() {
        LocalDate date = LocalDate.of(1980, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(16.44, result, 0.01);
    }

    @Test
    public void EstimateAfter2005Test() {
        LocalDate date = LocalDate.of(2010, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(66.32, result, 0.01);
    }

    @Test
    public void EstimateBetween1986And2005Test() {
        LocalDate date = LocalDate.of(1995, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(61.34, result, 0.01);
    }

    @Test
    public void EstimateBetween1986And1997Test() {
        LocalDate date = LocalDate.of(1990, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(56.30, result, 0.01);
    }

    @Test
    public void EstimateTestForLeapYear() {
        LocalDate date = LocalDate.of(2004, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(64.30, result, 0.01);
    }

}