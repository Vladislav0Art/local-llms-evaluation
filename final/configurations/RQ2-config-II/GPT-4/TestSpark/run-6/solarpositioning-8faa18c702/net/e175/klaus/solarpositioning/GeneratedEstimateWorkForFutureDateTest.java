package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GeneratedEstimateWorkForFutureDateTest {

    @Test
    public void estimateWorkForFutureDateTest() {
        LocalDate date = LocalDate.of(2050, 1, 1);
        double result = DeltaT.estimate(date);
        assertTrue(result >= 0);
    }

}