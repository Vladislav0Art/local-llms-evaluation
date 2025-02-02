package net.e175.klaus.solarpositioning;

public class GeneratedEstimate_DeltaTEstimateIsCorrectForYearAfter2150 {

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearAfter2150() {
        LocalDate forDate = LocalDate.of(2204, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(-20));
    }
}

public class DeltaT {

    public static double estimate(final LocalDate forDate) {
        // ...
    }

    private static double decimalYear(LocalDate forDate) {
        return forDate.getYear() + (forDate.getMonthValue() - 0.5) / 12;
    }

}