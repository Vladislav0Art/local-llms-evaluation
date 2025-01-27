package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_WithInvalidDate_ThrowsException {

    @Test
    public void estimate_WithInvalidDate_ThrowsException() {
        LocalDate date = LocalDate.of(2022, 13, 1); // February has only 28 or 29 days in a leap year
        try {
            DeltaT.estimate(date);
            assert false;
        } catch (ArithmeticException e) {
            assertEquals("Invalid date", e.getMessage());
        }
    }

}