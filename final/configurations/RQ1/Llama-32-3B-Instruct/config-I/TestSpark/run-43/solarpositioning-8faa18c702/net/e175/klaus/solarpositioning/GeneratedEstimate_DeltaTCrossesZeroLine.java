package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GeneratedEstimate_DeltaTCrossesZeroLine {

    @Test
    public void estimate_DeltaTCrossesZeroLine() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(0.0, result, ChronoUnit.SECONDS);
    }

}