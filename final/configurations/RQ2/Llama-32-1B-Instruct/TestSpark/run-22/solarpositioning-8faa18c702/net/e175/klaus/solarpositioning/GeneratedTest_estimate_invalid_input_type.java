package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_estimate_invalid_input_type {

    @Test
    public void test_estimate_invalid_input_type() {
        LocalDate forDate = null;
        try {
            estimate(forDate);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Failed to determine date", e.getMessage());
        }
    }

}