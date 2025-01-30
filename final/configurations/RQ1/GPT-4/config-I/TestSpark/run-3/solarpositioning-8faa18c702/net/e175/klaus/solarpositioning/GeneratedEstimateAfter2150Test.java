package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateAfter2150Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateAfter2150Test() {
        LocalDate date = LocalDate.of(2200, 1, 1);
        assertEquals(153.0, DeltaT.estimate(date), DELTA);
    }

}