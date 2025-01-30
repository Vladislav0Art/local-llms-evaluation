package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin1961And1986Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin1961And1986Test() {
        LocalDate date = LocalDate.of(1975, 1, 1);
        assertEquals(4.373205741626798, DeltaT.estimate(date), DELTA);
    }

}