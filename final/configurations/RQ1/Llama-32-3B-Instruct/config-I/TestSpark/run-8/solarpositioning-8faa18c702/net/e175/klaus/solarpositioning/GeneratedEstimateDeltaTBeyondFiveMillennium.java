package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTBeyondFiveMillennium {

    @Test
    public void estimateDeltaTBeyondFiveMillennium() {
        LocalDate forDate = LocalDate.of(2200, 12, 31);
        assertEquals(-24.8, DeltaT.estimate(forDate), 0.01);
    }

}

public class DeltaTCenturiesAfter2005 extends DeltaT {

    @Override
    public double estimate(LocalDate forDate) {
        return super.estimate(forDate);
    }

}