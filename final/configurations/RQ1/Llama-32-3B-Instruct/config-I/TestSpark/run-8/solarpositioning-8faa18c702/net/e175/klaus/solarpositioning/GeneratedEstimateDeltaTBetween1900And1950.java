package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTBetween1900And1950 {

    @Test
    public void estimateDeltaTBetween1900And1950() {
        LocalDate forDate = new LocalDate(1933, 6, 20);
        DeltaT deltaT = new DeltaTCenturiesAfter2005(forDate);
        assertEquals(23.7, deltaT.estimate(), 0.1);
    }

}