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
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Date to estimate DeltaT for must not be null.", e.getMessage());
        }
    }

    @Test
    public void estimateLeapYearFebTest() {
        LocalDate date = LocalDate.of(2020, 2, 29); // Leap year February 29
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

    @Test
    public void estimateNormalYearFebTest() {
        LocalDate date = LocalDate.of(2019, 2, 28); // Non-leap year February 28
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

    @Test
    public void estimateFutureDateTest() {
        LocalDate date = LocalDate.now().plusYears(1); // Date 1 year in the future
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

    @Test
    public void estimatePastDateTest() {
        LocalDate date = LocalDate.now().minusYears(1); // Date 1 year in the past
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

    @Test
    public void estimateCurrentDateTest() {
        LocalDate date = LocalDate.now(); // Current date
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

    @Test
    public void estimateBoundaryUpperValueTest() {
        LocalDate date = LocalDate.of(2019, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

    @Test
    public void estimateBoundaryLowerValueTest() {
        LocalDate date = LocalDate.of(1600, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

}