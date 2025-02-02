package net.e175.klaus.solarpositioning;

public class GeneratedEstimate_DeltaTEstimateIsCorrectForYearBetween1995And2000 {

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBetween1995And2000() {
        LocalDate forDate = LocalDate.of(1999, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(62.92));
    }

}