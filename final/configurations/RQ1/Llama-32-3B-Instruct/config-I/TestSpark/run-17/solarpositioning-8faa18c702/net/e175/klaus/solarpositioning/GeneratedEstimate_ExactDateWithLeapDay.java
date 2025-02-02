package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_ExactDateWithLeapDay {

    @Test
    public void estimate_ExactDateWithLeapDay() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(1001);
        double result = DeltaT.estimate(new LocalDate(1001, 1, 29));
        assertEquals(10583.7, result, 1e-10);
    }

}