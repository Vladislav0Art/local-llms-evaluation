package net.e175.klaus.solarpositioning;

public class GeneratedEstimate_DeltaTEstimateIsCorrectForYearBefore1800 {

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBefore1800() {
        LocalDate forDate = LocalDate.of(1769, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(8.83));
    }

}