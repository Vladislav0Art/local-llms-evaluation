package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateInvalidDateReturnErrorValue {

    @Test
    public void estimateInvalidDateReturnErrorValue() {
        LocalDate date = null;
        double result = DeltaT.estimate(date);
        // Check if the result is an error value (e.g., Double.POSITIVE_INFINITY)
        assertDoubleIsInf(result, 1e-10); // Adjust tolerance as needed
    }

}