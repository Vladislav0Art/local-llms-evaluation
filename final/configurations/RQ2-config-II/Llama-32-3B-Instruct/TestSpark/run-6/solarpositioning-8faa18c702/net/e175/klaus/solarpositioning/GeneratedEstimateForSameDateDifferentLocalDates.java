package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateForSameDateDifferentLocalDates {

    @Test
    public void estimateForSameDateDifferentLocalDates() {
        LocalDate forDate = LocalDate.of(2022, 7, 4);
        double result1 = DeltaT.estimate(forDate);
        assertEquals(-0.5, result1, 0); // Assuming the unit test is using this value

        LocalDate forDate2 = LocalDate.of(2022, 6, 4);
        double result2 = DeltaT.estimate(forDate2);
        assertEquals(0, result2, 0); // Assuming the unit test is using this value
    }

}