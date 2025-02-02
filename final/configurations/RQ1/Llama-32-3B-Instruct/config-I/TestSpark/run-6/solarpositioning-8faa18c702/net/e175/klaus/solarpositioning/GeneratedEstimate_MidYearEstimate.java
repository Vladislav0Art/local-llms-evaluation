package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_MidYearEstimate {

    @Test
    public void estimate_MidYearEstimate() {
        LocalDate forDate = LocalDate.of(1500, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -15 && result <= 5);
    }

}