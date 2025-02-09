package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedEstimateLeapYearReturnDeltaT {

    @Test
    public void estimateLeapYearReturnDeltaT() {
        LocalDate date = LocalDate.of(2016, 3, 8);
        Optional<Double> result = DeltaT.estimate(date);
        assertTrue(result.isPresent());
        double value = result.get();
        assertDoubleInRange(value, -0.0023055517, 0.0000068959, 1e-9);
    }

}