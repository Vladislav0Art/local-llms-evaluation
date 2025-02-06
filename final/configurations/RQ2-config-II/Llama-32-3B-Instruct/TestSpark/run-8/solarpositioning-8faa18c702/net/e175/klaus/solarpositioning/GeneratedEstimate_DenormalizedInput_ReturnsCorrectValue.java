package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimate_DenormalizedInput_ReturnsCorrectValue {

    @Test
    public void estimate_DenormalizedInput_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1970, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(6.0, result, 0.01);
    }

}