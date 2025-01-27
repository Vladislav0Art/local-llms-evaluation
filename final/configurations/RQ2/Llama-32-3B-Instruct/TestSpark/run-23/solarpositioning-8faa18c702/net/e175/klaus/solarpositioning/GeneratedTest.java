package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedTest {

    @Test
    public void EstimateDeltaTEvaluation() {
        assertEquals(0.0, DeltaT.estimate(LocalDate.now()), 1e-9);
    }

    @Test
    public void EstimateDeltaTLeapYearEvaluation() {
        LocalDate date = LocalDate.of(2024, 2, 29);
        assertEquals(-16720.0, DeltaT.estimate(date), 1e-9);
    }

    @Test
    public void EstimateDeltaTBeyond1800Evaluation() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        assertEquals(1624.5, DeltaT.estimate(date), 1e-9);
    }

    @Test
    public void EstimateDeltaTEliminateLeapYearEvaluation() {
        LocalDate date = LocalDate.of(2024, 2, 28);
        assertEquals(-16720.0, DeltaT.estimate(date), 1e-9);
    }

}