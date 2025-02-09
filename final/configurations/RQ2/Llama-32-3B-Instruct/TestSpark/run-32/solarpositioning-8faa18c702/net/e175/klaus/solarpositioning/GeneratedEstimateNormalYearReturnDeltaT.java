package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedEstimateNormalYearReturnDeltaT {

    @Test
    public void estimateNormalYearReturnDeltaT() {
        LocalDate date = LocalDate.of(2022, 6, 21);
        Optional<Double> result = DeltaT.estimate(date);
        assertTrue(result.isPresent());
        double value = result.get();
        assertDoubleInRange(value, -0.0000107837, 0.0000026839, 1e-9);
    }

}