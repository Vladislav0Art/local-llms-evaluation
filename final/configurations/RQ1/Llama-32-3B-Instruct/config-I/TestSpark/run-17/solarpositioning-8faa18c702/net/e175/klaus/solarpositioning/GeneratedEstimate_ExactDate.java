package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_ExactDate {

    @Test
    public void estimate_ExactDate() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(1000);
        double result = DeltaT.estimate(new LocalDate(1000, 1, 1));
        assertEquals(10583.6, result, 1e-10);
    }

}