package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_DifferentYear_ReturnsCorrectValue {

    @Test
    public void estimate_DifferentYear_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2022, 6, 20);
        double result = DeltaT.estimate(forDate);
        assertEquals(-12.4400025, result, 0.001);
    }

}