package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTSimpleCasesTest {

    @Test
    public void estimateDeltaTSimpleCasesTest() {
        int[][] years = {{-1000}, {1500}, {1800}};
        for (int[] y : years) {
            LocalDate forDate = LocalDate.of(y[0], 1, 1);
            double result = DeltaT.estimate(forDate);
            assertEquals(result, calculateExpectedDeltaT(y[0]), 0.01);
        }
    }

    private static double calculateExpectedDeltaT(int year) {
        switch (year) {
            case -1000:
                return -20 + 32 * pow(1.5, 2);
            case 1500:
                return 10583.6 - 1014.41 * 15 + 33.78311 * pow(15, 2)
                        - 5.952053 * pow(15, 3) - 0.1798452 * pow(15, 4)
                        + 0.022174192 * pow(15, 5) + 0.0090316521 * pow(15, 6);
            case 1800:
                return -20 + 32 * pow((18.0 / 100), 2);
        }
        throw new AssertionError();
    }
}

public class DeltaT {

    public static double estimate(LocalDate forDate) {
        // ... implementation ...
    }

    private static double decimalYear(LocalDate forDate) {
        return forDate.getYear() + (forDate.getMonthValue() - 0.5) / 12;
    }

}