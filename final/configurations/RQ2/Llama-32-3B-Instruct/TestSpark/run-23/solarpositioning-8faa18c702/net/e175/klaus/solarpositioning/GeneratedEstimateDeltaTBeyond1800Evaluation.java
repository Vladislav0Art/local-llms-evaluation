package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateDeltaTBeyond1800Evaluation {

    @Test
    public void EstimateDeltaTBeyond1800Evaluation() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        assertEquals(1624.5, DeltaT.estimate(date), 1e-9);
    }

}