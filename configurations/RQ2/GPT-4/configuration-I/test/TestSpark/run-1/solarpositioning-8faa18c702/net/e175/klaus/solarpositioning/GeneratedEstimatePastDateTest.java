package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        final double epsilon = 1e-15;
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals("Expected delta T for past date", result, epsilon);
    }

}