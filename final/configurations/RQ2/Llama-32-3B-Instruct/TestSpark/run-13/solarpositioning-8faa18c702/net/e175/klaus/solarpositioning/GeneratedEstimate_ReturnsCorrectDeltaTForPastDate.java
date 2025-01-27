package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_ReturnsCorrectDeltaTForPastDate {

    @Test
    public void estimate_ReturnsCorrectDeltaTForPastDate() {
        LocalDate past = LocalDate.now().minusDays(365);
        double expectedDeltaT = 2.65;
        when(DeltaT.estimate(past)).thenReturn(expectedDeltaT);
        assertEquals(expectedDeltaT, (int) DeltaT.estimate(past), 1e-6);
    }

}