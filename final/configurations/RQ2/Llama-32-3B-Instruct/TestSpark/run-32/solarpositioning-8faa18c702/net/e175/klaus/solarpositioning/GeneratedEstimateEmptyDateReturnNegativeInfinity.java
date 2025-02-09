package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedEstimateEmptyDateReturnNegativeInfinity {

    @Test
    public void estimateEmptyDateReturnNegativeInfinity() {
        LocalDate date = null;
        double result = DeltaT.estimate(date);
        assertEquals(Double.NEGATIVE_INFINITY, result, 1e-9);
    }

}