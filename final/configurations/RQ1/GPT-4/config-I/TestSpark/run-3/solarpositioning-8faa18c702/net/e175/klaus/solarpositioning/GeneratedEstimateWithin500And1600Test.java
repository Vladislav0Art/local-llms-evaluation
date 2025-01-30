package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateWithin500And1600Test {

    private static final double DELTA = 1e-8;

    @Test
    public void estimateWithin500And1600Test() {
        LocalDate date = LocalDate.of(1500, 1, 1);
        assertEquals(4165.399323160548, DeltaT.estimate(date), DELTA);
    }

}