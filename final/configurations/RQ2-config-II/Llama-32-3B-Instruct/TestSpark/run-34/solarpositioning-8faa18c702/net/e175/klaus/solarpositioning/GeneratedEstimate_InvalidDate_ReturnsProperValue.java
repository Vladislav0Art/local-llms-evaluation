package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_InvalidDate_ReturnsProperValue {

    @Test
    public void estimate_InvalidDate_ReturnsProperValue() {
        LocalDate forDate = null;
        double result = DeltaT.estimate(forDate);
        assertEquals(0d, result);
    }

}