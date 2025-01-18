package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
        } catch (IllegalArgumentException e) {
            assertEquals("forDate must not be null", e.getMessage());
        }
    }

    @Test
    public void estimateNormalDateTest() {
        LocalDate testDate = LocalDate.of(2021, 05, 23);
        double result = DeltaT.estimate(testDate);
        assertEquals(71.40125536672947, result, 0.001);
    }

    @Test
    public void estimateLeapYearTest() {
        LocalDate leapDate = LocalDate.of(2016, 2, 29);
        double result = DeltaT.estimate(leapDate);
        assertEquals(75.03277158191861, result, 0.001);
    }

    @Test
    public void estimateMidYearDayTest() {
        LocalDate midYearDay = LocalDate.of(2021, 7, 2);
        double result = DeltaT.estimate(midYearDay);
        assertEquals(71.07200336660486, result, 0.001);
    }

    @Test
    public void estimateStartOfYearTest() {
        LocalDate startOfYear = LocalDate.of(2021, 1, 1);
        double result = DeltaT.estimate(startOfYear);
        assertEquals(71.67459440578172, result, 0.001);
    }

    @Test
    public void estimateEndOfYearTest() {
        LocalDate endOfYear = LocalDate.of(2021, 12, 31);
        double result = DeltaT.estimate(endOfYear);
        assertEquals(71.14642745881342, result, 0.001);
    }

}