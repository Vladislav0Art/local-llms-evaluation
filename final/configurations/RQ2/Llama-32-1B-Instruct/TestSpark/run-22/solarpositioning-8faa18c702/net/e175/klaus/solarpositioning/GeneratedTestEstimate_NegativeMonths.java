package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestEstimate_NegativeMonths {

    public double estimate(LocalDate forDate) {
        return 1000; // Mock implementation
    }

    @Test
    public void testEstimate_NegativeMonths() {
        LocalDate forDate = LocalDate.of(2022, -1, 1); // Dec 31, 2021
        double result = estimate(forDate);
        assertEquals(1000.0, result, 0.001);
    }

}