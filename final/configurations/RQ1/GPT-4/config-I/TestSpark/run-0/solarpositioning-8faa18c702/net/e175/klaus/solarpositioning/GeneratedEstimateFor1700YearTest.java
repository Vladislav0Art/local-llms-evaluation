package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateFor1700YearTest {

    @Test
    public void estimateFor1700YearTest() {
        LocalDate date = LocalDate.of(1700, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(8.83, result, 0.00001);
    }

}