package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateDateIn

    farPastTest() {
        LocalDate date = LocalDate.of(-500, 1, 1);
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

    @Test
    public void estimateDateInPastTest() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

    @Test
    public void estimateDateInFutureTest() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

    @Test
    public void estimateDateInPresentTest() {
        LocalDate date = LocalDate.now();
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

    @Test
    public void estimateLeapYearTest() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

    @Test
    public void estimateNullDateTest() {
        LocalDate date = null;
        double result = DeltaT.estimate(date);
    }

}