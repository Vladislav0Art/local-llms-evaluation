package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedEstimateTestWithNonLeapYearDate {

    @Test
    public void estimateTestWithNonLeapYearDate() {
        LocalDate date = LocalDate.of(2023, 2, 28);
        double deltaT = DeltaT.estimate(date);
        assertFalse("DeltaT.estimate() did not calculate correct value", deltaT <= 0);
    }

}