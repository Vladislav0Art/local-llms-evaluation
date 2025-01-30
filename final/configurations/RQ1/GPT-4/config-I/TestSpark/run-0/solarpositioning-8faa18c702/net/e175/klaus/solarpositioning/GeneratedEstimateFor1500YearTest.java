package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateFor1500YearTest {

    @Test
    public void estimateFor1500YearTest() {
        LocalDate date = LocalDate.of(1500, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(1574.2, result, 0.00001);
    }

}