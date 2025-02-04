package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTFor1990s_ReturnsCorrectValue {

    @Test
    public void estimateDeltaTFor1990s_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(1999, 1, 1);
        double expected = 63.86 + 0.3345 * ((date.getYear() - 2000) / 100) - 0.060374 * pow(((date.getYear() - 2000) / 100), 2);
        assertEquals(expected, DeltaT.estimate(date));
    }

}