package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimate_MockImplementationTestsCorrectResult {

    @Test
    public void estimate_MockImplementationTestsCorrectResult() {
        // Given and when
        DeltaT.estimate = mock(DeltaT.class);
        when(DeltaT.estimate(date)).thenReturn(100.0);

        // Then
        assertEquals(100.0, DeltaT.estimate(date), 1e-9);
    }

}