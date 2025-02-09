package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedEstimateTestWithFutureDate {

    @Test
    public void estimateTestWithFutureDate() {
        LocalDate date = LocalDate.of(3000, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertFalse("DeltaT.estimate() did not calculate correct value", deltaT <= 0);
    }

}