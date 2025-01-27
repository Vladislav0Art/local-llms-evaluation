package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedEstimateMockitoOutOfRangeDateReturnsDeltaTMax {

    @Test
    public void estimateMockitoOutOfRangeDateReturnsDeltaTMax() {
        LocalDate date = LocalDate.of(2022, 12, 31); // Last day of December
        when(DeltaT.mocketa.date(date)).thenReturn(DeltaT.DELTA_T_MAX);
        assertEquals(DeltaT.DELTA_T_MAX, DeltaT.mocketa(date), 0.001);
    }
}

public class DeltaT {
    public static double estimate(LocalDate date) { /* implementation */ }

    public static LocalDate mocketa(LocalDate date) { /* implementation */
    }

}