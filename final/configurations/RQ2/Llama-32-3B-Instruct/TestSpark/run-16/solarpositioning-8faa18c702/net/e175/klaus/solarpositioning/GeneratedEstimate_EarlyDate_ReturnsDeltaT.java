package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_EarlyDate_ReturnsDeltaT {

    @Test
    public void estimate_EarlyDate_ReturnsDeltaT() {
        LocalDate date = LocalDate.of(2022, 12, 1);
        when(DeltaT.estimate(date)).thenReturn(-12.5);

        double result = DeltaT.estimate(date);
        assertEquals(-12.5, result, 0.01);
    }

}