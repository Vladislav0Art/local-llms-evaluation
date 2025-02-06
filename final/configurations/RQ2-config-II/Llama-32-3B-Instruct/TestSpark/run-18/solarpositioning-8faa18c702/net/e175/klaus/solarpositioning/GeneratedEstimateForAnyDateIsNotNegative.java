package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

public class GeneratedEstimateForAnyDateIsNotNegative {

    @Test
    public void estimateForAnyDateIsNotNegative() {
        LocalDate anyDate = LocalDate.of(2022, 7, 25);
        assertFalse(Double.isNaN(DeltaT.estimate(anyDate)));
        assertTrue(DeltaT.estimate(anyDate) >= 0);
    }
}

}