package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_DecadeDeltaTEarly1700s {

    @Test
    public void estimate_DecadeDeltaTEarly1700s() {
        when(DeltaT.decimalYear(Mockito.mock(LocalDate.class))).thenReturn(1715);
        assertEquals(-3.83, DeltaT.estimate(Mockito.mock.LocalDate.class), 0.01);
    }

}