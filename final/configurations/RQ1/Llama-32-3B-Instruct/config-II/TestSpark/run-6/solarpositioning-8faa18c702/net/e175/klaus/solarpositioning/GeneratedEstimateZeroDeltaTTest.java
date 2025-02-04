package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class GeneratedEstimateZeroDeltaTTest {

    @Test
    public void estimateZeroDeltaTTest() {
        when(DeltaT.decimalYear(any(LocalDate.class))).thenReturn(1820);
        assertEquals(0, DeltaT.estimate(LocalDate.of(2001, 2, 29)));
        verify(DeltaT, never()).decimalYear(any());
    }

}