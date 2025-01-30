package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin1860And1900Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin1860And1900Test() {
        LocalDate date = LocalDate.of(1880, 1, 1);
        assertEquals(14.32509831262545, DeltaT.estimate(date), DELTA);
    }

}