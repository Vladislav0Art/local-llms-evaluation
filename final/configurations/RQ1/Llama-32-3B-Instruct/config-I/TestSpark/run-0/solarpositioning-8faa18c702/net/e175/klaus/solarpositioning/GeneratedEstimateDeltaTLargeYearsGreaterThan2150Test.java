package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTLargeYearsGreaterThan2150Test {

    @Test
    public void estimateDeltaTLargeYearsGreaterThan2150Test() {
        LocalDate date = LocalDate.of(2151, 12, 10);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2) - 0.5628 * (2150 - date.getYear()), deltaT, 0.01);
    }

}