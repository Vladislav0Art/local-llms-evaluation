package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin1900And1920Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin1900And1920Test() {
        LocalDate date = LocalDate.of(1910, 1, 1);
        assertEquals(20.100785987094967, DeltaT.estimate(date), DELTA);
    }

}