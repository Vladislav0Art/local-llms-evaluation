package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_LateDate_ReturnsDeltaT {

    @Test
    public void estimate_LateDate_ReturnsDeltaT() {
        LocalDate date = LocalDate.of(2023, 1, 1);
        when(DeltaT.estimate(date)).thenReturn(13.5);

        double result = DeltaT.estimate(date);
        assertEquals(13.5, result, 0.01);
    }

}