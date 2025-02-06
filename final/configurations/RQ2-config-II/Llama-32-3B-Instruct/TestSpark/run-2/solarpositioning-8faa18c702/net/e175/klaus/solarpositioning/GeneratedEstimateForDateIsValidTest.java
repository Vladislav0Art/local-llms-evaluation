package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateForDateIsValidTest {

    @Test
    public void estimateForDateIsValidTest() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(0, pow(result - (-11.57), 2), 1e-6);
    }

}