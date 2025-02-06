package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateEmptyDateRange Test {

    @Test
    public void estimateEmptyDateRange

    Test() {
        LocalDate forDate = null;
        double result = DeltaT.estimate(forDate);
        assertTrue(Double.isNaN(result));
    }

}