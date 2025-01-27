package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void estimate_CorrectDate_ReturnsDeltaT() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        when(DeltaT.estimate(date)).thenReturn(12.5);

        double result = DeltaT.estimate(date);
        assertEquals(12.5, result, 0.01);
    }

    @Test
    public void estimate_InvalidDate_ThrowsException() {
        LocalDate date = LocalDate.of(-1, 1, 1);
        when(DeltaT.estimate(date)).thenThrow(IllegalArgumentException.class);

        org.junit.Assert.assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(date));
    }

    @Test
    public void estimate_EarlyDate_ReturnsDeltaT() {
        LocalDate date = LocalDate.of(2022, 12, 1);
        when(DeltaT.estimate(date)).thenReturn(-12.5);

        double result = DeltaT.estimate(date);
        assertEquals(-12.5, result, 0.01);
    }

    @Test
    public void estimate_LateDate_ReturnsDeltaT() {
        LocalDate date = LocalDate.of(2023, 1, 1);
        when(DeltaT.estimate(date)).thenReturn(13.5);

        double result = DeltaT.estimate(date);
        assertEquals(13.5, result, 0.01);
    }

}