package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestEstimateForMultipleDates_SingleDateTimeWithDifferentDeltas {

    private final DeltaT deltaT = new DeltaT();

    @BeforeEach
    public void init() {
        // No setup needed, tests are independent
    }

    @Test
    public void testEstimateForMultipleDates_SingleDateTimeWithDifferentDeltas() {
        LocalDate forDate1 = LocalDate.of(2024, 1, 1);
        LocalDate forDate2 = LocalDate.of(2024, 1, 2);
        double expected = pow(1e-5, 2) + (pow(9.81, 0.04) * 3600) + (pow(-9.81, 0.04) * 14400); // -10 m/s^2
        assertEquals(expected, deltaT.estimate(forDate1).estimate(forDate2));
    }

}