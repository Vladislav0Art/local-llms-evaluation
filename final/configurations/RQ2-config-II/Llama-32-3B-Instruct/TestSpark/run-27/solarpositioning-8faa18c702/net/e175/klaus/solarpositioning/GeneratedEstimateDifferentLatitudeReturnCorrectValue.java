package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDifferentLatitudeReturnCorrectValue {

    @Test
    public void estimateDifferentLatitudeReturnCorrectValue() {
        LocalDate date = LocalDate.of(2022, 6, 21);
        double latitude1 = 37.7749; // San Francisco
        double latitude2 = 52.5200; // Berlin
        double result1 = DeltaT.estimate(date, latitude1);
        double result2 = DeltaT.estimate(date, latitude2);
        assertDoubleAreEqual(result1, result2, 0.001); // Adjust precision as needed
    }

    private void assertDoubleIsInf(double value, double tolerance) {
        if (Double.isInfinite(value)) {
            // Check for positive infinity
            assertTrue(Double.isPositiveInfinity(value));
        } else if (Double.isNaN(value)) {
            fail("NaN");
        }
    }

    private boolean assertDoubleAreEqual(double a, double b, double precision) {
        return Math.abs(a - b) <= precision;
    }

}