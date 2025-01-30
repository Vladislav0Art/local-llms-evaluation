package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateFor1860YearTest {

    @Test
    public void estimateFor1860YearTest() {
        LocalDate date = LocalDate.of(1860, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(7.62, result, 0.00001);
    }

}