package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_InvalidYearIsCorrectTest {

    @Test
    public void estimateDeltaT_InvalidYearIsCorrectTest() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        assertEquals(Double.valueOf(-20 + 32 * pow(((forDate.getYear() - 1820) / 100), 2)), DeltaT.estimate(forDate));
    }

}

public class DeltaTTemporal {

    public static double estimate(final LocalDate forDate) {
        final double year = decimalYear(forDate);
        // ... same code as in the original
    }

    private static double decimalYear(LocalDate forDate) {
        return forDate.getYear() + (forDate.getMonthValue() - 0.5) / 12;
    }

}