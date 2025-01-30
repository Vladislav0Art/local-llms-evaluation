package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin1600And1700Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin1600And1700Test() {
        LocalDate date = LocalDate.of(1650, 1, 1);
        assertEquals(62.61728395061729, DeltaT.estimate(date), DELTA);
    }

}