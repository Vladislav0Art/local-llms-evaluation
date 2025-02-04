package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

public class GeneratedDecimalYear_YearWithLeapMonth_GeneratesCorrectResult {

    @Test
    public void decimalYear_YearWithLeapMonth_GeneratesCorrectResult() {
        LocalDate forDate = LocalDate.of(1904, 2, 29);
        double result = DeltaT.decimalYear(forDate);
        assertEquals(46.25, result, 0.01);
    }

}