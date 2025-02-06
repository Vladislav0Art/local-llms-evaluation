package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.Math;

public class GeneratedEstimateForDate_ReturnsPositiveValue {

    @Test
    public void estimateForDate_ReturnsPositiveValue() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= 0);
    }

}