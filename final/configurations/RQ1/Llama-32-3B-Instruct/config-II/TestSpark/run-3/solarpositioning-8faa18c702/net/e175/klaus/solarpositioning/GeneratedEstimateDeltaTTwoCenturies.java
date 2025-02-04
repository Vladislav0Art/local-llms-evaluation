package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTTwoCenturies {

    @Test
    public void estimateDeltaTTwoCenturies() {
        LocalDate forDate = LocalDate.of(2200, 1, 1);
        assertEquals(-20.0, DeltaT.estimate(forDate), 0.001);
    }

}