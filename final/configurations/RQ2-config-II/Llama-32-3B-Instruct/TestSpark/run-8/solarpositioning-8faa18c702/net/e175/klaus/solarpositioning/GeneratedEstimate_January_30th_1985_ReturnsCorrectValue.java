package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimate_January_30th_1985_ReturnsCorrectValue {

    @Test
    public void estimate_January_30th_1985_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1985, 1, 30);
        double result = DeltaT.estimate(forDate);
        assertEquals(-11.5, result, 0.01);
    }

}