package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTForYearBetween1820And2150Test {

    @Test
    public void estimate_DeltaTForYearBetween1820And2150Test() {
        LocalDate forDate = LocalDate.of(2125, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20.0, result, 0.001);
    }

}

public class DeltaT {

    public static double estimate(final LocalDate forDate) {
        final double year = decimalYear(forDate);
        final double deltaT;

        if (year < -500) {
            double u = (year - 1820) / 100;
            deltaT = -20 + 32 * pow(u, 2) - 0.5628 * (2150 - year);
        } else {
            double u = (year - 1820) / 100;
            deltaT = -20 + 32 * pow(u, 2);
        }

        return deltaT;
    }

    private static double decimalYear(LocalDate forDate) {
        return forDate.getYear() + (forDate.getMonthValue() - 0.5) / 12;
    }

}