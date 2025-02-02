package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_InvalidDate {

    @Test
    public void estimate_InvalidDate() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(-5000);
        double result = DeltaT.estimate(new LocalDate(10000, 1, 1));
        assertTrue(result == Double.NEGATIVE_INFINITY || result == Double.POSITIVE_INFINITY);
    }

}