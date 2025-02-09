package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaT_GivenFutureDate_ReturnsMinusOneMinute {

    @Test
    public void estimateDeltaT_GivenFutureDate_ReturnsMinusOneMinute() {
        LocalDate futureDate = LocalDate.now().plusDays(1);
        assertEquals(-1 / 60d, DeltaT.estimate(futureDate), 0.01);
    }

}