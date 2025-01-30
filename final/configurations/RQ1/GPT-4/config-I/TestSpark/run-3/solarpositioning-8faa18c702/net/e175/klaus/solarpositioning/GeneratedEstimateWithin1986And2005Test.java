package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin1986And2005Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin1986And2005Test() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        assertEquals(63.863262377850164, DeltaT.estimate(date), DELTA);
    }

}