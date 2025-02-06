package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimate_February_28th_1996_ReturnsCorrectValue {

    @Test
    public void estimate_February_28th_1996_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1996, 2, 28);
        double result = DeltaT.estimate(forDate);
        assertEquals(-10.8, result, 0.01);
    }

}