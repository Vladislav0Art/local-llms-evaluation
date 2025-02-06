package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateBeforeStartOfMonth Test {

    @Test
    public void estimateBeforeStartOfMonth

    Test() {
        LocalDate forDate = LocalDate.of(2022, 1, 15);
        double result = DeltaT.estimate(forDate);
        assertFalse(Double.isNaN(result));
    }

}