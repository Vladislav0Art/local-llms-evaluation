package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import net.e175.klaus.solarpositioning.DeltaT;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateNullDateTest {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateNullDateTest() {
        double estimatedDeltaT = DeltaT.estimate(null);
    }

}