package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

public class GeneratedDecimalYear_YearWithoutLeapMonth_GeneratesCorrectResult {

    @Test
    public void decimalYear_YearWithoutLeapMonth_GeneratesCorrectResult() {
        LocalDate forDate = LocalDate.of(1903, 2, 28);
        double result = DeltaT.decimalYear(forDate);
        assertEquals(45.92, result, 0.01);
    }

}