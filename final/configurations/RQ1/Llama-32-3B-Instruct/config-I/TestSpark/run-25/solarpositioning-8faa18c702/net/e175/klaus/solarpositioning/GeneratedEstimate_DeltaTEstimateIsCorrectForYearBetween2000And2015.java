package net.e175.klaus.solarpositioning;

public class GeneratedEstimate_DeltaTEstimateIsCorrectForYearBetween2000And2015 {

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBetween2000And2015() {
        LocalDate forDate = LocalDate.of(2009, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(63.86));
    }

}