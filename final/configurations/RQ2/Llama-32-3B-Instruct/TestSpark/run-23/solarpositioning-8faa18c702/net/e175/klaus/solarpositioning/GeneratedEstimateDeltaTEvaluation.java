package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateDeltaTEvaluation {

    @Test
    public void EstimateDeltaTEvaluation() {
        assertEquals(0.0, DeltaT.estimate(LocalDate.now()), 1e-9);
    }

}