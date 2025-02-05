package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GeneratedEstimateWorkForLeapYearTest {

    @Test
    public void estimateWorkForLeapYearTest() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        double result = DeltaT.estimate(date);
        assertTrue(result >= 0);
    }

}