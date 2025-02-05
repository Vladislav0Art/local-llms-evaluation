package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            fail("Should throw NullPointerException for null date");
        } catch (NullPointerException e) {
            // expected exception
        }
    }

    @Test
    public void estimatePastCenturyDateTest() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

    @Test
    public void estimateFutureCenturyDateTest() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

    @Test
    public void estimateRecentPastDateTest() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

    @Test
    public void estimateRecentFutureDateTest() {
        LocalDate date = LocalDate.of(2030, 1, 1);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

    @Test
    public void estimateLeapYearDateTest() {
        LocalDate date = LocalDate.of(2004, 2, 29);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

    @Test
    public void estimateNonLeapYearDateTest() {
        LocalDate date = LocalDate.of(2003, 2, 28);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

}