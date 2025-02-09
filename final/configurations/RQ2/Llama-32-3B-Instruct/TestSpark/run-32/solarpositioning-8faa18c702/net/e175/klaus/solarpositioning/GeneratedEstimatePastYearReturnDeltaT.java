package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedEstimatePastYearReturnDeltaT {

    @Test
    public void estimatePastYearReturnDeltaT() {
        LocalDate date = LocalDate.of(2021, 6, 21);
        Optional<Double> result = DeltaT.estimate(date);
        assertTrue(result.isPresent());
        double value = result.get();
        assertDoubleInRange(value, -0.0000137848, 0.0000033444, 1e-9);
    }

}