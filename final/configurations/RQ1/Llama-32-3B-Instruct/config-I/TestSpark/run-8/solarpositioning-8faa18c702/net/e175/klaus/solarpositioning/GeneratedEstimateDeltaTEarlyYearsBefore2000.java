package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTEarlyYearsBefore2000 {

    @Test
    public void estimateDeltaTEarlyYearsBefore2000() {
        LocalDate forDate = new LocalDate(1800, 1, 1);
        DeltaT deltaT = new DeltaTCenturiesAfter2005(forDate);
        assertEquals(-21.8, deltaT.estimate(), 0.01);
    }

}