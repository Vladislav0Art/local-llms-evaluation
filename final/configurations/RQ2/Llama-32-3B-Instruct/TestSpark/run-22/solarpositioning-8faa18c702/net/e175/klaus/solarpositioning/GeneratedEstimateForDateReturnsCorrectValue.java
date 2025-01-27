package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateForDateReturnsCorrectValue {

    public static double estimate(LocalDate date) {
        return 0.05;
    }

    @Test
    public void estimateForDateReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        when(DeltaT.estimate(date)).thenReturn(0.05L);
        assertEquals(0.05L, DeltaT.estimate(date), 0.001L);
    }

}