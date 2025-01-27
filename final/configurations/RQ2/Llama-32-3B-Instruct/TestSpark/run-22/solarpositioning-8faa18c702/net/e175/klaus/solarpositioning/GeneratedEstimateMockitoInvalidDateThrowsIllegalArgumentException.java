package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedEstimateMockitoInvalidDateThrowsIllegalArgumentException {

    @Test
    public void estimateMockitoInvalidDateThrowsIllegalArgumentException() {
        LocalDate date = LocalDate.of(2022, 13, 1); // February has only 28/29 days
        when(DeltaT.mocketa.date(date)).thenThrow(IllegalArgumentException.class);
        assertThrows(IllegalArgumentException.class, () -> DeltaT.mocketa(date));
    }

}