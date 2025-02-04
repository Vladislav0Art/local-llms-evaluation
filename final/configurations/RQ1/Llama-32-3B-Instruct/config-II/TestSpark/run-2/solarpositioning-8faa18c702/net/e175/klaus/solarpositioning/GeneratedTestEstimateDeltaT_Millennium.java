package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTestEstimateDeltaT_Millennium {

    public static double calculateDeltaT(LocalDate forDate) {
        return DeltaT.estimate(forDate);
    }

    @Test
    public void testEstimateDeltaT_Millennium() {
        LocalDate date = LocalDate.of(2001, 6, 21);
        assertEquals(-20 + 32 * pow((2001 - 1820) / 100, 2), DeltaT.estimate(date), 0.01);
    }

}