package net.e175.klaus.solarpositioning;

public class GeneratedEstimate_DeltaTEstimateIsCorrectForYearBefore1900 {

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBefore1900() {
        LocalDate forDate = LocalDate.of(1864, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(13.72));
    }

}