package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedEstimateFutureYearReturnDeltaT {

    @Test
    public void estimateFutureYearReturnDeltaT() {
        LocalDate date = LocalDate.of(2023, 6, 21);
        Optional<Double> result = DeltaT.estimate(date);
        assertTrue(result.isPresent());
        double value = result.get();
        assertDoubleInRange(value, -0.0000185851, 0.0000055342, 1e-9);
    }

    private void assertDoubleInRange(double actual, double lower, double upper, double epsilon) {
        if (actual < lower - epsilon || actual > upper + epsilon) {
            fail("Expected value to be in range [" + lower + ", " + upper + "), but got " + actual);
        }
    }

}