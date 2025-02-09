package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void estimate_DifferentDates_ReturnsDeltaT() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(1.0);
        assertEquals(1.0, (double) DeltaT.estimate(LocalDate.of(2022, 6, 15)));
    }

    @Test
    public void estimate_SameDate_ReturnsZero() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(0.0);
        assertEquals(0.0, (double) DeltaT.estimate(LocalDate.of(2022, 6, 15)));
    }

    @Test
    public void estimate_NonExistentDate_ThrowsException() {
        try {
            DeltaT.estimate(LocalDate.of(-1, 1, 1));
            assert false;
        } catch (IllegalArgumentException e) {
            assertEquals("No valid delta T for the given date.", e.getMessage());
        }
    }

    @Test
    public void estimate_NoDeltaTSpecified_ReturnsZero() {
        assertEquals(0.0, (double) DeltaT.estimate(LocalDate.of(2022, 6, 15)));
    }

}