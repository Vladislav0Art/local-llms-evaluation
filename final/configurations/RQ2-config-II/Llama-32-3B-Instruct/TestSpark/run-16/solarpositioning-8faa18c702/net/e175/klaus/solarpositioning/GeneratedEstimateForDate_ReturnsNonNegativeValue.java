package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.Math;

public class GeneratedEstimateForDate_ReturnsNonNegativeValue {

    @Test
    public void estimateForDate_ReturnsNonNegativeValue() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertFalse(result < 0);
    }

}