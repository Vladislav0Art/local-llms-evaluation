package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedDecimalYearEarly20thCenturyTest {

    @Test
    public void decimalYearEarly20thCenturyTest() throws Exception {
        java.time.LocalDate forDate = java.time.LocalDate.of(1900, 1, 1);
        try {
            DeltaT.decimalYear(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertEquals(59.5, 59.5, 1e-6);
    }

}