package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateAfterEndOfMonth Test {

    @Test
    public void estimateAfterEndOfMonth

    Test() {
        LocalDate forDate = LocalDate.of(2022, 12, 25);
        double result = DeltaT.estimate(forDate);
        assertFalse(Double.isNaN(result));
    }

}