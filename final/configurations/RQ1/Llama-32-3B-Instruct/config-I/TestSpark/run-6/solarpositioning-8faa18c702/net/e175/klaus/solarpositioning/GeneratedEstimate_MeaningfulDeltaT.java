package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_MeaningfulDeltaT {

    @Test
    public void estimate_MeaningfulDeltaT() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -25 && result <= 5);
    }
}

}