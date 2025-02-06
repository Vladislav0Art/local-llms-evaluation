package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateForDateLeapYearTest {

    @Test
    public void estimateForDateLeapYearTest() {
        LocalDate date = LocalDate.of(1976, 2, 29);
        double result = DeltaT.estimate(date);
        assertEquals(365.242419, result, 0.00001);
    }

}