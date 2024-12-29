package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestEstimateForMultipleDates_SingleDateTimeWithDifferentSignsAndZeroDelta {

    private final DeltaT deltaT = new DeltaT();

    @BeforeEach
    public void init() {
        // No setup needed, tests are independent
    }

    @Test
    public void testEstimateForMultipleDates_SingleDateTimeWithDifferentSignsAndZeroDelta() {
        LocalDate forDate = LocalDate.of(2024, 1, 1);
        double expected = pow(1e-5, 2); // 0 m/s^2
        assertEquals(expected, deltaT.estimate(forDate).estimate(forDate));
    }

}