package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_HighYearEstimate {

    @Test
    public void estimate_HighYearEstimate() {
        LocalDate forDate = LocalDate.of(2159, 12, 31);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20, result, 0.01);
    }

}