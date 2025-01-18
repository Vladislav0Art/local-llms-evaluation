package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateNullDateTest() {
        try {
            double result = DeltaT.estimate(null);
        } catch (NullPointerException e) {
            Assert.assertEquals("Date cannot be null", e.getMessage());
        }
    }

    @Test
    public void estimateValidDateTest() {
        LocalDate testDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(testDate);
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void estimateLeapYearDateTest() {
        LocalDate leapYearDate = LocalDate.of(2020, 2, 29);
        double result = DeltaT.estimate(leapYearDate);
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void estimateFutureYearDateTest() {
        LocalDate futureYearDate = LocalDate.of(3022, 1, 1);
        double result = DeltaT.estimate(futureYearDate);
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void estimatePastYearDateTest() {
        LocalDate pastYearDate = LocalDate.of(1922, 1, 1);
        double result = DeltaT.estimate(pastYearDate);
        Assert.assertTrue(result >= 0);
    }

}