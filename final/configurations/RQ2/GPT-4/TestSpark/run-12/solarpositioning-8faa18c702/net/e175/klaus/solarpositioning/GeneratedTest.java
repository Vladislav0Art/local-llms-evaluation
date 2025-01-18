package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            fail("IllegalArgumentException expected when date is null");
        } catch (IllegalArgumentException e) {
            assertEquals("date can't be null", e.getMessage());
        }
    }

    @Test
    public void estimateLeapYearFebruaryTest() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        double result = DeltaT.estimate(date);
        double expectedDelta = 70.50; // replace with expected delta t value for this date
        assertEquals(expectedDelta, result, 0.01);
    }

    @Test
    public void estimateNonLeapYearFebruaryTest() {
        LocalDate date = LocalDate.of(2021, 2, 28);
        double result = DeltaT.estimate(date);
        double expectedDelta = 71.27; // replace with expected delta t value for this date
        assertEquals(expectedDelta, result, 0.01);
    }

    @Test
    public void estimateStartOfYearTest() {
        LocalDate date = LocalDate.of(2021, 1, 1);
        double result = DeltaT.estimate(date);
        double expectedDelta = 70.85; // replace with expected delta t value for this date
        assertEquals(expectedDelta, result, 0.01);
    }

    @Test
    public void estimateEndOfYearTest() {
        LocalDate date = LocalDate.of(2021, 12, 31);
        double result = DeltaT.estimate(date);
        double expectedDelta = 72.01; // replace with expected delta t value for this date
        assertEquals(expectedDelta, result, 0.01);
    }

}