package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_ReturnsZeroForNullDate {

    @Test
    public void estimate_ReturnsZeroForNullDate() {
        when(DeltaT.estimate(null)).thenReturn(0.0);
        assertEquals(0, (int) DeltaT.estimate(null));
    }

}