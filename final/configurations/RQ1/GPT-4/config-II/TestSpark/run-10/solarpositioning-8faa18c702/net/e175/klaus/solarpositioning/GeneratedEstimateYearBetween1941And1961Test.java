package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1941And1961Test {

    @Test
    public void estimateYearBetween1941And1961Test() {
        LocalDate date = LocalDate.of(1950, 5, 1);
        assertTrue(DeltaT.estimate(date) == 32.8778125);
    }

}