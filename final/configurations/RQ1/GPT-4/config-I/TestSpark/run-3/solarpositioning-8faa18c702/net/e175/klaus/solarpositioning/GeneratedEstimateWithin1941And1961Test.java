package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin1941And1961Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin1941And1961Test() {
        LocalDate date = LocalDate.of(1950, 1, 1);
        assertEquals(29.362962962962962, DeltaT.estimate(date), DELTA);
    }

}