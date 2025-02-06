package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimate_ValidDateReturnsCorrectValue {

    @Test
    public void estimate_ValidDateReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(date);
        // Implementation of the test depends on the actual implementation of estimate()
        assertTrue("Correct value not returned", result > 0.0 && result < 360.0);
    }

}