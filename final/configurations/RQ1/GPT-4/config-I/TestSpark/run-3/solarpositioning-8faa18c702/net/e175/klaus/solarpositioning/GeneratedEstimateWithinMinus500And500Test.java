package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithinMinus500And500Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithinMinus500And500Test() {
        LocalDate date = LocalDate.of(100, 1, 1);
        assertEquals(12435.912347912367, DeltaT.estimate(date), DELTA);
    }

}