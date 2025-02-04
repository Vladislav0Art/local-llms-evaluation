package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTFutureYearPositiveValues {

    @Test
    public void estimateDeltaTFutureYearPositiveValues() {
        LocalDate forDate = LocalDate.of(2024, 12, 15);
        assertEquals(0.001, DeltaT.estimate(forDate), 0.001);
    }

}