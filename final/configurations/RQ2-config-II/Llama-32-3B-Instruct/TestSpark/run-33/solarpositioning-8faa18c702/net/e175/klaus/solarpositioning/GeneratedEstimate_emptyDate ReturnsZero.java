package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_emptyDate ReturnsZero {

    @Test
    public void estimate_emptyDate

    ReturnsZero() {
        assertTrue(DeltaT.estimate(null) == 0);
    }

}