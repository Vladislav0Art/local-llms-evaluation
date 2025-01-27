package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_InvalidDate_ThrowsException {

    @Test
    public void estimate_InvalidDate_ThrowsException() {
        LocalDate date = LocalDate.of(-1, 1, 1);
        when(DeltaT.estimate(date)).thenThrow(IllegalArgumentException.class);

        org.junit.Assert.assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(date));
    }

}