package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForFutureYears_ReturnsCorrectValue {

    @Test
    public void estimateDeltaTForFutureYears_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double expected = -20 + 32 * pow(((date.getYear() - 1820) / 100), 2) - 0.5628 * (2150 - date.getYear());
        assertEquals(expected, DeltaT.estimate(date));
    }

}