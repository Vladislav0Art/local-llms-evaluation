package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimate_December_31st_1999_ReturnsCorrectValue {

    @Test
    public void estimate_December_31st_1999_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1999, 12, 31);
        double result = DeltaT.estimate(forDate);
        assertEquals(-6.8, result, 0.01);
    }

}