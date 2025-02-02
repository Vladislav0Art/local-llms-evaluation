package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTEarlyYearsBefore1975 {

    @Test
    public void estimateDeltaTEarlyYearsBefore1975() {
        LocalDate forDate = new LocalDate(1750, 1, 1);
        DeltaT deltaT = new DeltaTCenturiesAfter2005(forDate);
        assertEquals(-76.2, deltaT.estimate(), 0.01);
    }

}