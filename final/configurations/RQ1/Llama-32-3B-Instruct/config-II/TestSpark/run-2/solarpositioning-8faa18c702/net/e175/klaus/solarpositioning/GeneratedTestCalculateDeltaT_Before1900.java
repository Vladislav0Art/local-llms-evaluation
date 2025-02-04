package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTestCalculateDeltaT_Before1900 {

    public static double calculateDeltaT(LocalDate forDate) {
        return DeltaT.estimate(forDate);
    }

    @Test
    public void testCalculateDeltaT_Before1900() {
        LocalDate date = LocalDate.of(1850, 1, 1);
        assertEquals(-2.79, calculateDeltaT(date), 0.01);
    }

}