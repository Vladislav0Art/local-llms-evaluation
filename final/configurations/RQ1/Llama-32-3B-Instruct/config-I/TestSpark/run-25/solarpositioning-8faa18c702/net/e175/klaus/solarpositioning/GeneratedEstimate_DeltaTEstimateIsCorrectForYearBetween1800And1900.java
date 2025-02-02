package net.e175.klaus.solarpositioning;

public class GeneratedEstimate_DeltaTEstimateIsCorrectForYearBetween1800And1900 {

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBetween1800And1900() {
        LocalDate forDate = LocalDate.of(1824, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(8.83));
    }

}