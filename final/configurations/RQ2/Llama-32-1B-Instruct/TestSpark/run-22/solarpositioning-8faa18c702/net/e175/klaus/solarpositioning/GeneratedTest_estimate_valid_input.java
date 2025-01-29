package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_estimate_valid_input {

    @Test
    public void test_estimate_valid_input() {
        LocalDate forDate = LocalDate.of(2023, 6, 15);
        double result = estimate(forDate);
        assertEquals(1000.0, result, 1e-5); // Approximate the actual value with a tolerance of 1%
    }

}