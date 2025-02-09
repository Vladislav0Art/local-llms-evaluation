package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedEstimateTestWithValidDate {

    @Test
    public void estimateTestWithValidDate() {
        LocalDate date = LocalDate.of(2020, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertFalse("DeltaT.estimate() did not calculate correct value", deltaT <= 0);
    }

}