package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedEstimateTestWithPastDate {

    @Test
    public void estimateTestWithPastDate() {
        LocalDate date = LocalDate.of(1000, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertFalse("DeltaT.estimate() did not calculate correct value", deltaT <= 0);
    }

}