package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import static junit.framework.TestCase.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateValidYearTest() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(63.83, result, 0.01);
    }

    @Test
    public void estimateLeapYearTest() {
        LocalDate date = LocalDate.of(2020, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(69.57, result, 0.01);
    }

    @Test
    public void estimateNonLeapYearTest() {
        LocalDate date = LocalDate.of(2019, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(69.24, result, 0.01);
    }

    @Test
    public void estimateMonthChangeTest() {
        LocalDate date = LocalDate.of(2019, 12, 31);
        double result = DeltaT.estimate(date);
        assertEquals(69.24, result, 0.01);
    }

    @Test
    public void estimateDayChangeTest() {
        LocalDate date = LocalDate.of(2019, 1, 31);
        double result = DeltaT.estimate(date);
        assertEquals(69.24, result, 0.01);
    }

}