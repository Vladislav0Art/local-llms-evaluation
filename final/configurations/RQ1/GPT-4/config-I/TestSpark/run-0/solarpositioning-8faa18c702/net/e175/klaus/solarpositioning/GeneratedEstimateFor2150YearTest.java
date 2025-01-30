package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateFor2150YearTest {

    @Test
    public void estimateFor2150YearTest() {
        LocalDate date = LocalDate.of(2150, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(-20.0, result, 0.00001);
    }

}