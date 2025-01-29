package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_estimate_negative_number {

    @Test
    public void test_estimate_negative_number() {
        LocalDate forDate = LocalDate.of(2023, 6, 15);
        double result = estimate(forDate - LocalDate.of(2024, 1, 1));
        assertEquals(null, result, 1e-5); // Approximate the actual value with a tolerance of 1%
    }

}