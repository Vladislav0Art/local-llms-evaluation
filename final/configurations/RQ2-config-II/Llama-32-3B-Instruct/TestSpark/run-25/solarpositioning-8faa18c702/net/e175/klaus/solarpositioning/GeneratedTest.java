package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void estimate_DeltaTNegativeDouble() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(-1.0);
        assertEquals(-1.0, DeltaT.estimate(LocalDate.of(2022, 12, 20)));
    }

    @Test
    public void estimate_DeltaTPositiveDouble() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(1.0);
        assertEquals(1.0, DeltaT.estimate(LocalDate.of(2022, 12, 20)));
    }

    @Test
    public void estimate_DeltaTZero() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(0.0);
        assertEquals(0.0, DeltaT.estimate(LocalDate.of(2022, 12, 20)));
    }

    @Test
    public void estimate_SameDayDiffPositiveDeltaT() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(-1.0);
        assertEquals(-1.0, DeltaT.estimate(LocalDate.of(2023, 12, 20)));
    }

    @Test
    public void estimate

    SameDayDiffNegativeDeltaT() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(1.0);
        assertEquals(1.0, DeltaT.estimate(LocalDate.of(2022, 12, 21)));
    }

    @Test
    public void estimate

    SameDayDiffZeroDeltaT() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(0.0);
        assertEquals(0.0, DeltaT.estimate(LocalDate.of(2023, 12, 20)));
    }

}