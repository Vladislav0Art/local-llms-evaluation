package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateExtremeFutureDateTest {

    private static final double DELTA = 0.01;

    @Test
    public void estimateExtremeFutureDateTest() {
        LocalDate date = LocalDate.of(4000, 1, 1);
        double delta = DeltaT.estimate(date);
        assertEquals(376.63, delta, DELTA);
    }

}