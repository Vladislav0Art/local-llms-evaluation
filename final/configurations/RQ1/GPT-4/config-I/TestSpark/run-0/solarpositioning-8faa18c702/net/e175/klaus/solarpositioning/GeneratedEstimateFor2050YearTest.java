package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateFor2050YearTest {

    @Test
    public void estimateFor2050YearTest() {
        LocalDate date = LocalDate.of(2050, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(62.92, result, 0.00001);
    }

}