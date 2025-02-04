package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTestEstimateDeltaT_Century1 {

    public static double calculateDeltaT(LocalDate forDate) {
        return DeltaT.estimate(forDate);
    }

    @Test
    public void testEstimateDeltaT_Century1() {
        LocalDate date = LocalDate.of(1500, 6, 21);
        assertEquals(-20 + 32 * pow((1500 - 1820) / 100, 2), DeltaT.estimate(date), 0.01);
    }

}