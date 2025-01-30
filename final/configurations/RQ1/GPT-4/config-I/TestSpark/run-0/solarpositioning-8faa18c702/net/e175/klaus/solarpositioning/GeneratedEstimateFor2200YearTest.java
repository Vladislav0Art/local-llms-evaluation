package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateFor2200YearTest {

    @Test
    public void estimateFor2200YearTest() {
        LocalDate date = LocalDate.of(2200, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(96.0, result, 0.00001);
    }

}