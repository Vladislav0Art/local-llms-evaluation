package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimateWhenDayLengthIsZero {

    @Test
    public void estimateWhenDayLengthIsZero() {
        LocalDate dayLengthZero = LocalDate.of(2022, 12, 21);
        double result = DeltaT.estimate(dayLengthZero);
        assertEquals(-1.0 / 14400.0, result, 1e-9);
    }

}