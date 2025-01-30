package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin2050And2150Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin2050And2150Test() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        assertEquals(20.761262964666666, DeltaT.estimate(date), DELTA);
    }

}