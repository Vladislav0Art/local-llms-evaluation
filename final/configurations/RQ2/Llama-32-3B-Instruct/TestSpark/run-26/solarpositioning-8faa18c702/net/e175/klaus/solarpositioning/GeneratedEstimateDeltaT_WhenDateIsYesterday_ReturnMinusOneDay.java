package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateDeltaT_WhenDateIsYesterday_ReturnMinusOneDay {

    @Test
    public void estimateDeltaT_WhenDateIsYesterday_ReturnMinusOneDay() {
        LocalDate date = LocalDate.now().minusDays(1);
        assertEquals(-1, (double) DeltaT.estimate(date));
    }

}