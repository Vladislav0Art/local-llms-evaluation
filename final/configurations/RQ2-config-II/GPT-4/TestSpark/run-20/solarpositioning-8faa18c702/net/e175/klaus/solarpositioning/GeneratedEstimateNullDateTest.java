package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateNullDateTest {

    private static final double DELTA = 0.01;

    @Test
    public void estimateNullDateTest() {
        DeltaT.estimate(null);
    }

}