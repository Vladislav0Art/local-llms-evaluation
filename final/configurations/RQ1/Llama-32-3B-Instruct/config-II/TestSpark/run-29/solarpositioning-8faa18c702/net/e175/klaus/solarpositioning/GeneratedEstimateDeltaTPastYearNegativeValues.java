package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTPastYearNegativeValues {

    @Test
    public void estimateDeltaTPastYearNegativeValues() {
        LocalDate forDate = LocalDate.of(-2005, 2, 13);
        assertEquals(-18.995, DeltaT.estimate(forDate), 0.0001);
    }

}