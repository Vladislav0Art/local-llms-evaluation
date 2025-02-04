package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTPositiveValuesTest {

    @Test
    public void estimateDeltaTPositiveValuesTest() {
        when(DeltaT.decimalYear(any(LocalDate.class))).thenReturn(2025);
        assertEquals(-20 + 32 * pow(((35) / 100), 2) - 0.5628 * (2150 - 2025), DeltaT.estimate(LocalDate.of(2001, 2, 29)));
        verify(DeltaT, never()).decimalYear(any());
    }

}