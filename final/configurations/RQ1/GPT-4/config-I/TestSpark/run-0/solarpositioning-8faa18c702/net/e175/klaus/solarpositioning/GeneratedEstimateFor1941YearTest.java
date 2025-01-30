package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateFor1941YearTest {

    @Test
    public void estimateFor1941YearTest() {
        LocalDate date = LocalDate.of(1941, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(29.07, result, 0.00001);
    }

}