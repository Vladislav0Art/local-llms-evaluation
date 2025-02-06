package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimate_January_31st_2001_ReturnsCorrectValue {

    @Test
    public void estimate_January_31st_2001_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2001, 1, 31);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.3, result, 0.01);
    }

}