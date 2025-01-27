package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedEstimateMockitoReturnsCorrectValue {

    @Test
    public void estimateMockitoReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        when(DeltaT.mocketa.date(date)).thenReturn(0.05);
        assertEquals(0.05, DeltaT.mocketa(date), 0.001);
    }

}