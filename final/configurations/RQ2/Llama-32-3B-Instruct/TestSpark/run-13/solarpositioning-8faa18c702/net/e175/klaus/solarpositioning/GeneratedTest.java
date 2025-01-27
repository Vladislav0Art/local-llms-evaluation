package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void estimate_ReturnsZeroForNullDate() {
        when(DeltaT.estimate(null)).thenReturn(0.0);
        assertEquals(0, (int) DeltaT.estimate(null));
    }

    @Test
    public void estimate_ReturnsZeroForEmptyDate() {
        LocalDate date = LocalDate.now().minusYears(1);
        when(DeltaT.estimate(date)).thenReturn(0.0);
        assertEquals(0, (int) DeltaT.estimate(date));
    }

    @Test
    public void estimate_ReturnsCorrectDeltaTForToday() {
        LocalDate today = LocalDate.now();
        double expectedDeltaT = 2.65;
        when(DeltaT.estimate(today)).thenReturn(expectedDeltaT);
        assertEquals(expectedDeltaT, (int) DeltaT.estimate(today), 1e-6);
    }

    @Test
    public void estimate_ReturnsCorrectDeltaTForPastDate() {
        LocalDate past = LocalDate.now().minusDays(365);
        double expectedDeltaT = 2.65;
        when(DeltaT.estimate(past)).thenReturn(expectedDeltaT);
        assertEquals(expectedDeltaT, (int) DeltaT.estimate(past), 1e-6);
    }

    @Test
    public void estimate_ThrowsNullPointerExceptionForNullDate() {
        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

}