package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaT_GivenLeapYearDate_ReturnsCorrectValue {

    @Test
    public void estimateDeltaT_GivenLeapYearDate_ReturnsCorrectValue() {
        LocalDate leapYear = LocalDate.of(2024, 2, 29);
        double result = DeltaT.estimate(leapYear);
        assertEquals(1 / 60d + 0.0013415, result, 0.01);
    }

}