package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_DeltaTNegativeDouble {

    @Test
    public void estimate_DeltaTNegativeDouble() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(-1.0);
        assertEquals(-1.0, DeltaT.estimate(LocalDate.of(2022, 12, 20)));
    }

}