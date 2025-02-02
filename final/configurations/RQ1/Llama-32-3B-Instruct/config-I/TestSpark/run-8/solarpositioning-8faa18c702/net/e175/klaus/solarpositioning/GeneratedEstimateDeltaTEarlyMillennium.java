package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTEarlyMillennium {

    @Test
    public void estimateDeltaTEarlyMillennium() {
        LocalDate forDate = new LocalDate(2005, 12, 31);
        DeltaT deltaT = new DeltaTCenturiesAfter2005(forDate);
        assertEquals(-21.8, deltaT.estimate(), 0.01);
    }

}