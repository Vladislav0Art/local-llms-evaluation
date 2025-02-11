package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTFarFutureYearNegativeValues {

    public static double estimate(LocalDate forDate) {
        // Implementation of the delta T calculator
        return 0;
    }

    public static double decimalYear(LocalDate forDate) {
        // Implementation of the decimal year calculation
        return 0;
    }
}

public class GeneratedTest {

    @Test
    public void estimateDeltaTFarFutureYearNegativeValues() {
        LocalDate forDate = LocalDate.of(-3000, 1, 1);
        double result = DeltaTCalculator.estimate(forDate);
        assertTrue(result < 0);
    }

}