package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateNonLeapYearTest {

    @Test
    public void estimateNonLeapYearTest() {
        LocalDate date = LocalDate.of(2019, 2, 28);
        double result = DeltaT.estimate(date);
        assertFalse(Double.isNaN(result));
    }

}