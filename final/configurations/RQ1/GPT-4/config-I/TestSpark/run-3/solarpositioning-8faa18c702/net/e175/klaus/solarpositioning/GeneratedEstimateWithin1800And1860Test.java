package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin1800And1860Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin1800And1860Test() {
        LocalDate date = LocalDate.of(1850, 1, 1);
        assertEquals(20.310177036844294, DeltaT.estimate(date), DELTA);
    }

}