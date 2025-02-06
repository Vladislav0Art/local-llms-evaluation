package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.Math;

public class GeneratedEstimateForNegativeYear_ReturnsZero {

    @Test
    public void estimateForNegativeYear_ReturnsZero() {
        LocalDate forDate = LocalDate.of(-2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(0, result, 0.00001); // Using a tolerance to handle floating-point precision issues.
    }

}