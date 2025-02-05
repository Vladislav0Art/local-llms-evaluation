package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GeneratedEstimateWorkForPastDateTest {

    @Test
    public void estimateWorkForPastDateTest() {
        LocalDate date = LocalDate.of(1950, 1, 1);
        double result = DeltaT.estimate(date);
        assertTrue(result >= 0);
    }

}