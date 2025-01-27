package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_SameDay_ReturnsSameValue {

    @Test
    public void estimate_SameDay_ReturnsSameValue() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        forDate = forDate.plusDays(1);
        double result = DeltaT.estimate(forDate);
        assertEquals(DeltaT.estimate(forDate), result, 0.001);
    }

}