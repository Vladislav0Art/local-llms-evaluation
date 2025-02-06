package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTPass {

    @Test
    public void estimateDeltaTPass() {
        LocalDate forDate = LocalDate.now();
        double result = DeltaT.estimate(forDate);
        assertTrue(result > 0 && result < 24);
    }

}