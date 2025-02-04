package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTFutureMonthPositiveValues {

    @Test
    public void estimateDeltaTFutureMonthPositiveValues() {
        LocalDate forDate = LocalDate.of(2024, 6, 15);
        assertEquals(-17.955, DeltaT.estimate(forDate), 0.001);
    }

}