package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTZeroPass {

    @Test
    public void estimateDeltaTZeroPass() {
        LocalDate forDate = LocalDate.of(1972, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(0, result, 1e-9);
    }

}