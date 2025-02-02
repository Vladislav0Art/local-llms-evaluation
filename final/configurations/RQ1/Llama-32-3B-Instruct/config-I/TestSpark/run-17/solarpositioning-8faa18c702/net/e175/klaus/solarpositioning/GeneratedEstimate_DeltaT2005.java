package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_DeltaT2005 {

    @Test
    public void estimate_DeltaT2005() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(2004);
        double result = DeltaT.estimate(new LocalDate(2005, 1, 1));
        assertTrue(result >= 63.86 && result <= 64.00);
    }

}