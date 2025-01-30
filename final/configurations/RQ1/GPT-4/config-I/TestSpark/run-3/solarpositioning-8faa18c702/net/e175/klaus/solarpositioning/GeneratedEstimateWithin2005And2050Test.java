package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin2005And2050Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin2005And2050Test() {
        LocalDate date = LocalDate.of(2030, 1, 1);
        assertEquals(70.24039999999999, DeltaT.estimate(date), DELTA);
    }

}