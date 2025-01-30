package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateFor1986YearTest {

    @Test
    public void estimateFor1986YearTest() {
        LocalDate date = LocalDate.of(1986, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(63.86, result, 0.00001);
    }

}