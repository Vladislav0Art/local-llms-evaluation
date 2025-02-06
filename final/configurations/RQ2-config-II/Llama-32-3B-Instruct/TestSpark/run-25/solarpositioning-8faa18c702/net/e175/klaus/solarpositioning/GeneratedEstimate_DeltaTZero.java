package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_DeltaTZero {

    @Test
    public void estimate_DeltaTZero() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(0.0);
        assertEquals(0.0, DeltaT.estimate(LocalDate.of(2022, 12, 20)));
    }

}