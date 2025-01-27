package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_ReturnsZeroForEmptyDate {

    @Test
    public void estimate_ReturnsZeroForEmptyDate() {
        LocalDate date = LocalDate.now().minusYears(1);
        when(DeltaT.estimate(date)).thenReturn(0.0);
        assertEquals(0, (int) DeltaT.estimate(date));
    }

}