package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBefore1800() {
        LocalDate forDate = LocalDate.of(1769, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(8.83));
    }

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBetween1800And1900() {
        LocalDate forDate = LocalDate.of(1824, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(8.83));
    }

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBetween1900And2000() {
        LocalDate forDate = LocalDate.of(1954, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(7.62));
    }

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBetween2000And2015() {
        LocalDate forDate = LocalDate.of(2009, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(63.86));
    }

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBefore1900() {
        LocalDate forDate = LocalDate.of(1864, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(13.72));
    }

    @Test
    public void estimate_DeltaTEstimateIsCorrectForYearBetween1995And2000() {
        LocalDate forDate = LocalDate.of(1999, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertThat(deltaT, is(62.92));
    }

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