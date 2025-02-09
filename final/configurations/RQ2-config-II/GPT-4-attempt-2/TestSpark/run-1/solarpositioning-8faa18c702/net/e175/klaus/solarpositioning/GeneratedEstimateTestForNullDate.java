package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForNullDate {

    public static final double DELTA = 0.01;

    @Test
    public void estimateTestForNullDate() {
        LocalDate date = null;
        DeltaT.estimate(date);
    }

}