package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin1700And1800Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin1700And1800Test() {
        LocalDate date = LocalDate.of(1750, 1, 1);
        assertEquals(9.88437948212523, DeltaT.estimate(date), DELTA);
    }

}