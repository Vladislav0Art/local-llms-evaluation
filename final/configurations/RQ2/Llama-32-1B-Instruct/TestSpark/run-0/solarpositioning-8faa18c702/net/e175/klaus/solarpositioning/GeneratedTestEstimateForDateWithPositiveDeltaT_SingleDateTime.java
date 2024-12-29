package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestEstimateForDateWithPositiveDeltaT_SingleDateTime {

    private final DeltaT deltaT = new DeltaT();

    @BeforeEach
    public void init() {
        // No setup needed, tests are independent
    }

    @Test
    public void testEstimateForDateWithPositiveDeltaT_SingleDateTime() {
        LocalDate forDate = LocalDate.of(2024, 1, 1);
        double expected = pow(1e-5, 2) + (pow(9.81, 0.04) * 3600); // 10 m/s^2
        assertEquals(expected, deltaT.estimate(forDate));
    }

}