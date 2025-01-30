package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateBeforeMinus500Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateBeforeMinus500Test() {
        LocalDate date = LocalDate.of(-999, 1, 1);
        assertEquals(-1969.0, DeltaT.estimate(date), DELTA);
    }

}