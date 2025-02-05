package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        final LocalDate forDate = null;
        double result = DeltaT.estimate(forDate);
    }

}