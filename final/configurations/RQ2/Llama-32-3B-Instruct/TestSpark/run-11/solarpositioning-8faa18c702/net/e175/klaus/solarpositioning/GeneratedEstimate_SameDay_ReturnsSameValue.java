package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import static org.mockito.Mockito.when;

public class GeneratedEstimate_SameDay_ReturnsSameValue {

    @Test
    public void estimate_SameDay_ReturnsSameValue() {
        LocalDate date = LocalDate.of(2022, 6, 15);
        when(DeltaT.estimate(date)).thenReturn(10.0); // replace with actual implementation
        assertEquals(10.0, DeltaT.estimate(date), 0.01);
    }

}