package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_estimate_invalid_date_type {

    @Test
    public void test_estimate_invalid_date_type() {
        LocalDate forDate = LocalDate.of(2023, 6, 15);
        try {
            estimate(forDate - null);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Failed to determine date", e.getMessage());
        }
    }

}