package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTFor1900s_ReturnsCorrectValue {

    @Test
    public void estimateDeltaTFor1900s_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(1901, 1, 1);
        double expected = -20 + 32 * pow(((date.getYear() - 1820) / 100), 2);
        assertEquals(expected, DeltaT.estimate(date));
    }

}