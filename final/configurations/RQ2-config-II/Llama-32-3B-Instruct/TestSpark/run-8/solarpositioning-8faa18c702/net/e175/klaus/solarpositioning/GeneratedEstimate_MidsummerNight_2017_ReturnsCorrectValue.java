package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimate_MidsummerNight_2017_ReturnsCorrectValue {

    @Test
    public void estimate_MidsummerNight_2017_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2017, 6, 21);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.5, result, 0.01);
    }

}