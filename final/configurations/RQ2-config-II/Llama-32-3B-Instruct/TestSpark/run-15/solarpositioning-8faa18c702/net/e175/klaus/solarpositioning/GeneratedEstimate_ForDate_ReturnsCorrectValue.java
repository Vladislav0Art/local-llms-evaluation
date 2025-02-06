package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_ForDate_ReturnsCorrectValue {

    @Test
    public void estimate_ForDate_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        assertEquals(0.0, DeltaT.estimate(forDate), 0.00001);
    }

}