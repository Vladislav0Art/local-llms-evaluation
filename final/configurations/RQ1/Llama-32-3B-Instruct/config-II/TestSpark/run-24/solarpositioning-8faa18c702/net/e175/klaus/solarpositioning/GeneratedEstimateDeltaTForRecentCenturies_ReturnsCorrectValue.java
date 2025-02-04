package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForRecentCenturies_ReturnsCorrectValue {

    @Test
    public void estimateDeltaTForRecentCenturies_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2005, 1, 1);
        double expected = -20 + 32 * pow(((date.getYear() - 1820) / 100), 2);
        assertEquals(expected, DeltaT.estimate(date));
    }

}