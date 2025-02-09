package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Optional;

public class GeneratedEstimateNonGregorianCalendarReturnDeltaT {

    @Test
    public void estimateNonGregorianCalendarReturnDeltaT() {
        LocalDate date = LocalDate.of(2010, 6, 21);
        Optional<Double> result = DeltaT.estimate(date);
        assertTrue(result.isPresent());
        assertDoubleInRange(result.get(), -0.0023055517, 0.0000068952, 1e-9); // 1e-9 for floating point comparison
    }

    private void assertDoubleNegInfinity(double value) {
        assertEquals(Double.NEGATIVE_INFINITY, value, 1e-9);
    }

    private void assertNotEquals(double value1, double value2, double epsilon) {
        if (Math.abs(value1 - value2) <= epsilon) {
            fail("Expected values not to be equal");
        }
    }

    private boolean assertDoubleInRange(double value, double min, double max, double epsilon) {
        return Math.abs(value - min) <= epsilon && Math.abs(value - max) <= epsilon;
    }

}