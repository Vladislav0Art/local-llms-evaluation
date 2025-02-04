package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltamissingDateThrowExceptionTest {

    @Test
    public void estimateDeltamissingDateThrowExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(null));
    }
}

public class DeltaT {

    private static double pow(double u, int exponent) {
        return Math.pow(u, exponent);
    }

    public static double estimate(final LocalDate forDate) {
        final double year = decimalYear(forDate);
        final double deltaT;

        if (year < -500) {
            double u = (year - 1820) / 100;
            deltaT = -20 + 32 * pow(u, 2);
        } else if (year < 500) {
            double u = year / 100;
            deltaT = 10583.6 - 1014.41 * u + 33.78311 * pow(u, 2) - 5.952053 * pow(u, 3)
                    - 0.1798452 * pow(u, 4);
        } // ... (rest of the method remains the same)

    }

    private static double decimalYear(LocalDate forDate) {
        return forDate.getYear() + (forDate.getMonthValue() - 0.5) / 12;
    }

}