package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_estimate_null_object_reference {

    @Test
    public void test_estimate_null_object_reference() {
        LocalDate forDate = null;
        double result = estimate(forDate);
        assertEquals(1000.0, result, 1e-5); // Approximate the actual value with a tolerance of 1%
    }

}