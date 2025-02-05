package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateExtremePastDateTest {

    private static final double DELTA = 0.01;

    @Test
    public void estimateExtremePastDateTest() {
        LocalDate date = LocalDate.of(1000, 1, 1);
        double delta = DeltaT.estimate(date);
        assertEquals(171.20, delta, DELTA);
    }

}