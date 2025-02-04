package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTPastMonthNegativeValues {

    @Test
    public void estimateDeltaTPastMonthNegativeValues() {
        LocalDate forDate = LocalDate.of(-2005, 9, 13);
        assertEquals(19.996, DeltaT.estimate(forDate), 0.0001);
    }

}