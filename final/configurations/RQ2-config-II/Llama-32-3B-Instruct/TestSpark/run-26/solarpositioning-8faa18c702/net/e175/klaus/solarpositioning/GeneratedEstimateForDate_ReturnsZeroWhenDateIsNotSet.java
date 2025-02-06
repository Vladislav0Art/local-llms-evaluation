package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

import java.util.Arrays;

public class GeneratedEstimateForDate_ReturnsZeroWhenDateIsNotSet {

    @Test
    public void estimateForDate_ReturnsZeroWhenDateIsNotSet() {
        assertEquals(0, DeltaT.estimate(null));
    }

}