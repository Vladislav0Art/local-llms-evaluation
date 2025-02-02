package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_DeltaT1900 {

    @Test
    public void estimate_DeltaT1900() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(1860);
        double result = DeltaT.estimate(new LocalDate(1900, 1, 1));
        assertTrue(result >= -2.79 && result <= 21.20);
    }

}