package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateDeltaTEliminateLeapYearEvaluation {

    @Test
    public void EstimateDeltaTEliminateLeapYearEvaluation() {
        LocalDate date = LocalDate.of(2024, 2, 28);
        assertEquals(-16720.0, DeltaT.estimate(date), 1e-9);
    }

}