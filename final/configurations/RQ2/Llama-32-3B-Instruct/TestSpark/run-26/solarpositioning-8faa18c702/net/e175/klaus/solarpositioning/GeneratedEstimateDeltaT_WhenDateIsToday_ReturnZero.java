package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateDeltaT_WhenDateIsToday_ReturnZero {

    @Test
    public void estimateDeltaT_WhenDateIsToday_ReturnZero() {
        LocalDate date = LocalDate.now();
        assertEquals(0, (double) DeltaT.estimate(date));
    }

}