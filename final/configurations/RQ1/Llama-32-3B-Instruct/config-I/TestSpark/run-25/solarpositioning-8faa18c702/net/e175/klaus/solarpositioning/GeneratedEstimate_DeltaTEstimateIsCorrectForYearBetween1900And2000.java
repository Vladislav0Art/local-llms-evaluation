package net.e175.klaus.solarpositioning;

public class GeneratedEstimate_DeltaTEstimateIsCorrectForYearBetween1900And2000 {

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBetween1900And2000() {
        LocalDate forDate = LocalDate.of(1954, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(7.62));
    }

}