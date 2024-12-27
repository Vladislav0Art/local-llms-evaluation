package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimatePresentDateTest {

    @Test
    public void estimatePresentDateTest() {
        final double epsilon = 1e-15;
        LocalDate forDate = LocalDate.now();
        double result = DeltaT.estimate(forDate);
        assertEquals("Expected delta T for present date", result, epsilon);
    }

}