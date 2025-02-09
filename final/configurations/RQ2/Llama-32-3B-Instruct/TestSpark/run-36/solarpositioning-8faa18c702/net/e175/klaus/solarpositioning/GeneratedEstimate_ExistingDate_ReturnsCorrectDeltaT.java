package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

import java.util.List;

public class GeneratedEstimate_ExistingDate_ReturnsCorrectDeltaT {

    @Test
    public void estimate_ExistingDate_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2022, 6, 1);
        double expected = calculateExpectedDeltaT(date); // implement calculation for test
        assertEquals(expected, DeltaT.estimate(date));
    }

}