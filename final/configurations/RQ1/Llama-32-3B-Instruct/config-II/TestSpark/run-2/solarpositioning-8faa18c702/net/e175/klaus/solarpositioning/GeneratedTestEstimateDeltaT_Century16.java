package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTestEstimateDeltaT_Century16 {

    public static double calculateDeltaT(LocalDate forDate) {
        return DeltaT.estimate(forDate);
    }

    @Test
    public void testEstimateDeltaT_Century16() {
        LocalDate date = LocalDate.of(1601, 6, 21);
        assertEquals(-20 + 32 * pow((1601 - 1820) / 100, 2), DeltaT.estimate(date), 0.01);
    }

}