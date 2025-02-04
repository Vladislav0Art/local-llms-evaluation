package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedDecimalYear_CorrectYearValue_ReturnsCorrectDecimalValue {

    @Test
    public void decimalYear_CorrectYearValue_ReturnsCorrectDecimalValue() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = DeltaT.decimalYear(forDate);
        assertEquals(50.25, result, 0.01);
    }

}