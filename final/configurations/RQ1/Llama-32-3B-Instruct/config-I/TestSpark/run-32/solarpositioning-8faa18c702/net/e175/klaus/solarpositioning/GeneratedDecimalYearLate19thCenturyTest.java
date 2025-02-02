package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedDecimalYearLate19thCenturyTest {

    @Test
    public void decimalYearLate19thCenturyTest() throws Exception {
        java.time.LocalDate forDate = java.time.LocalDate.of(1800, 1, 1);
        try {
            DeltaT.decimalYear(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertEquals(57.75, 57.75, 1e-6);
    }

}