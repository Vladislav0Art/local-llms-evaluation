package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin1920And1941Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin1920And1941Test() {
        LocalDate date = LocalDate.of(1930, 1, 1);
        assertEquals(27.843396589656904, DeltaT.estimate(date), DELTA);
    }

}