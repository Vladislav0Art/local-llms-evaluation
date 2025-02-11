package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForPastYearIsCorrect {

    @Test
    public void estimateDeltaTForPastYearIsCorrect() {
        LocalDate date = LocalDate.of(2023, 1, 1);
        double result = DeltaT.estimate(date);
        // implementation omitted for brevity
    }

}