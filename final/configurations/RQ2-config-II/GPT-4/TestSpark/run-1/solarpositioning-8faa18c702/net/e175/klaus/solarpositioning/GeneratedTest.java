package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateEarlierThanTheStartOfTheTimeScaleTest() {
        LocalDate date = LocalDate.of(1601, 1, 1);
        assertTrue(Double.isNaN(DeltaT.estimate(date)));
    }

    @Test
    public void estimateAtTheStartOfTheTimeScaleTest() {
        LocalDate date = LocalDate.of(1620, 1, 1);
        assertEquals(0, DeltaT.estimate(date), 0.01);
    }

    @Test
    public void estimateLaterThanTheStartOfTheTimeScaleTest() {
        LocalDate date = LocalDate.of(1621, 1, 1);
        assertNotEquals(0, DeltaT.estimate(date), 0.01);
    }

    @Test
    public void estimateAtMiddleOfTheTimeScaleTest() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        assertNotEquals(0, DeltaT.estimate(date), 0.01);
    }

    @Test
    public void estimateAtEndDateOfTheTimeScaleTest() {
        LocalDate date = LocalDate.of(2019, 12, 31);
        assertNotEquals(0, DeltaT.estimate(date), 0.01);
    }

    @Test
    public void estimateFutureDateTest() {
        LocalDate date = LocalDate.of(3000, 1, 1);
        assertNotEquals(0, DeltaT.estimate(date), 0.01);
    }

}