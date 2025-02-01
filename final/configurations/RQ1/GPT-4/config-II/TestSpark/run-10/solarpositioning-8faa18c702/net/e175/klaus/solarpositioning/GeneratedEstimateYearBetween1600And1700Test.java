package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1600And1700Test {

    @Test
    public void estimateYearBetween1600And1700Test() {
        LocalDate date = LocalDate.of(1650, 7, 1);
        assertTrue(DeltaT.estimate(date) == 82.92337270559986);
    }

}