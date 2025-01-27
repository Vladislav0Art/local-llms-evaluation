package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateInvalidDateThrowsIllegalArgumentException {

    public static double estimate(LocalDate date) {
        return 0.05;
    }

    @Test
    public void estimateInvalidDateThrowsIllegalArgumentException() {
        LocalDate date = LocalDate.of(2022, 13, 1); // February has only 28/29 days
        when(DeltaT.estimate(date)).thenThrow(IllegalArgumentException.class);
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(date));
    }

}