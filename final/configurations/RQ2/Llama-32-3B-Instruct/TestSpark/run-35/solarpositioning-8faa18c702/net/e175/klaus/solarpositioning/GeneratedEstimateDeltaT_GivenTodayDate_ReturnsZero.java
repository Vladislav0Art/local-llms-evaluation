package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaT_GivenTodayDate_ReturnsZero {

    @Test
    public void estimateDeltaT_GivenTodayDate_ReturnsZero() {
        LocalDate today = LocalDate.now();
        assertEquals(0, DeltaT.estimate(today));
    }

}