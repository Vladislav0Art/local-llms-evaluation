package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForFutureYearIsCorrect {

    @Test
    public void estimateDeltaTForFutureYearIsCorrect() {
        LocalDate date = LocalDate.of(2030, 12, 31);
        double result = DeltaT.estimate(date);
        // implementation omitted for brevity
    }

}