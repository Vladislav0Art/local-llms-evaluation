package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedEstimateTestWithLeapYearDate {

    @Test
    public void estimateTestWithLeapYearDate() {
        LocalDate date = LocalDate.of(2024, 2, 29);
        double deltaT = DeltaT.estimate(date);
        assertFalse("DeltaT.estimate() did not calculate correct value", deltaT <= 0);
    }

}