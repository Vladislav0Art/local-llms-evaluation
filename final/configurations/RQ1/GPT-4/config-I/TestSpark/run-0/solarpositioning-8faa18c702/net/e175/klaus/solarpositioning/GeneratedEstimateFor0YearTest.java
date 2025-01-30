package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateFor0YearTest {

    @Test
    public void estimateFor0YearTest() {
        LocalDate date = LocalDate.of(0, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(10583.6, result, 0.00001);
    }

}