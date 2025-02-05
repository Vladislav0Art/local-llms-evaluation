package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GeneratedEstimateWorkForAValidDateTest {

    @Test
    public void estimateWorkForAValidDateTest() {
        LocalDate date = LocalDate.of(2020, 1, 1);
        double result = DeltaT.estimate(date);
        assertTrue(result >= 0);
    }

}