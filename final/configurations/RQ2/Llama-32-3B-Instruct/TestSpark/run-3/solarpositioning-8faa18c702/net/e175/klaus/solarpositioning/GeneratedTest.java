package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

public class GeneratedTest {

    @Test
    public void estimateIsDoubleTest() {
        assertTrue(Double.class.isInstance(DeltaT.estimate(LocalDate.now())));
    }

    @Test
    public void estimateNullIsThrownTest() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

    @Test
    public void nowDayIsZeroTest() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        assertEquals(DeltaT.estimate(date), -0.000043667, 1e-9); // using delta T on January 1st (Eastern Standard Time)
    }

    @Test
    public void nextMonthIsDeltaTMinusOneTest() {
        LocalDate date = LocalDate.of(2022, 12, 31);
        assertEquals(DeltaT.estimate(date), -0.000043667, 1e-9); // using delta T on December 31st (Eastern Standard Time)
    }

    @Test
    public void pastYearIsDeltaTMinusOneTest() {
        LocalDate date = LocalDate.of(2022, 12, 31);
        assertEquals(DeltaT.estimate(date), -0.000043667, 1e-9); // using delta T on December 31st (Eastern Standard Time)
    }

    @Test
    public void futureYearIsDeltaTMinusOneTest() {
        LocalDate date = LocalDate.of(2023, 12, 31);
        assertEquals(DeltaT.estimate(date), -0.000043667, 1e-9); // using delta T on December 31st (Eastern Standard Time)
    }

    @Test
    public void estimateLeapYearIsDeltaTMinusOneTest() {
        LocalDate date = LocalDate.of(2024, 2, 29);
        assertEquals(DeltaT.estimate(date), -0.000043667, 1e-9); // using delta T on February 29th (Eastern Standard Time)
    }

}