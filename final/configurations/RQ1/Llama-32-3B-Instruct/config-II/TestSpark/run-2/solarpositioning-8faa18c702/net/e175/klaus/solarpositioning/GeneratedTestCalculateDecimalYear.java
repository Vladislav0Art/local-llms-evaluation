package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTestCalculateDecimalYear {

    public static double calculateDeltaT(LocalDate forDate) {
        return DeltaT.estimate(forDate);
    }

    @Test
    public void testCalculateDecimalYear() {
        LocalDate date = LocalDate.of(1999, 12, 31);
        assertEquals(100.25, DeltaT.decimalYear(date), 0.01);
    }

}