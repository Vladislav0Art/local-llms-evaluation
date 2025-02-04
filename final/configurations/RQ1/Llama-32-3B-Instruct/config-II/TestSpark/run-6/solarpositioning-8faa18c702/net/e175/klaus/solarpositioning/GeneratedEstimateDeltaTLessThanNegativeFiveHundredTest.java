package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTLessThanNegativeFiveHundredTest {

    @Test
    public void estimateDeltaTLessThanNegativeFiveHundredTest() {
        when(DeltaT.decimalYear(any(LocalDate.class))).thenReturn(-1500);
        assertEquals(-20 + 32 * pow((-50) / 100, 2), DeltaT.estimate(LocalDate.of(2001, 2, 29)));
        verify(DeltaT, never()).decimalYear(any());
    }

}