package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

import java.util.Arrays;

public class GeneratedEstimateForSameDay_SameDeltaT {

    @Test
    public void estimateForSameDay_SameDeltaT() {
        LocalDate sameDateToday = LocalDate.now();
        double sameDayDeltaT = DeltaT.estimate(sameDateToday);
        double todayDeltaT = DeltaT.estimate(LocalDate.now());
        assertEquals(todayDeltaT, sameDayDeltaT, 1e-9);
    }

}