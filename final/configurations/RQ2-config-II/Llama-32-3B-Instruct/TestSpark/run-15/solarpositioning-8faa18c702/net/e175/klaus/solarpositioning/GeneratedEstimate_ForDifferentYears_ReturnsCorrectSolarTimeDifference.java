package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_ForDifferentYears_ReturnsCorrectSolarTimeDifference {

    @Test
    public void estimate_ForDifferentYears_ReturnsCorrectSolarTimeDifference() {
        LocalDate forDate1 = LocalDate.of(2021, 12, 31);
        LocalDate forDate2 = LocalDate.of(2023, 1, 31);
        assertEquals(5.25, DeltaT.estimate(forDate1) - DeltaT.estimate(forDate2), 0.00001);
    }

}