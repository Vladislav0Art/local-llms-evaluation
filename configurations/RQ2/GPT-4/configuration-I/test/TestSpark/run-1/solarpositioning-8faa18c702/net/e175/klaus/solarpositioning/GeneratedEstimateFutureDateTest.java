package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        final double epsilon = 1e-15;
        LocalDate forDate = LocalDate.of(2030, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals("Expected delta T for future date", result, epsilon);
    }

}