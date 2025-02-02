package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_EdgeCase {

    @Test
    public void estimate_EdgeCase() {
        LocalDate forDate = LocalDate.of(2022, 12, 31);

        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -15 && result <= 5);
    }

}