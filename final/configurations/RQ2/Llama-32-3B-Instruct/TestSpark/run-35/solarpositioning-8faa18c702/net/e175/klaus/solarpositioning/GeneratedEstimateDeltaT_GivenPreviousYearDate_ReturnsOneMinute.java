package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaT_GivenPreviousYearDate_ReturnsOneMinute {

    @Test
    public void estimateDeltaT_GivenPreviousYearDate_ReturnsOneMinute() {
        LocalDate previousYear = LocalDate.of(2023, 12, 31);
        assertEquals(1 / 60d, DeltaT.estimate(previousYear), 0.01);
    }

}