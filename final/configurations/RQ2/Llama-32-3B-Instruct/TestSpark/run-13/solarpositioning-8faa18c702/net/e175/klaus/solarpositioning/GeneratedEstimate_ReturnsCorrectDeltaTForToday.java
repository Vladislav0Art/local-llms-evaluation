package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_ReturnsCorrectDeltaTForToday {

    @Test
    public void estimate_ReturnsCorrectDeltaTForToday() {
        LocalDate today = LocalDate.now();
        double expectedDeltaT = 2.65;
        when(DeltaT.estimate(today)).thenReturn(expectedDeltaT);
        assertEquals(expectedDeltaT, (int) DeltaT.estimate(today), 1e-6);
    }

}