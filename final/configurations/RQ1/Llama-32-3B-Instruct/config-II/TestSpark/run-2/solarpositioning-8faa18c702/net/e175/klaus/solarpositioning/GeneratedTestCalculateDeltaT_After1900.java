package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTestCalculateDeltaT_After1900 {

    public static double calculateDeltaT(LocalDate forDate) {
        return DeltaT.estimate(forDate);
    }

    @Test
    public void testCalculateDeltaT_After1900() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        assertEquals(63.86, calculateDeltaT(date), 0.01);
    }

}