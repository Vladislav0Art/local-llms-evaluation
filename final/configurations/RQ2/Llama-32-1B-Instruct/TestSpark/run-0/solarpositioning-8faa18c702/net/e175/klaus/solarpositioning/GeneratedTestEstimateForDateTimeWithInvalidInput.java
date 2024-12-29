package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestEstimateForDateTimeWithInvalidInput {

    private final DeltaT deltaT = new DeltaT();

    @BeforeEach
    public void init() {
        // No setup needed, tests are independent
    }

    @Test
    public void testEstimateForDateTimeWithInvalidInput() {
        LocalDate forDate = LocalDate.of(2024, 1, 1);
        assertThrows(IllegalArgumentException.class, () -> deltaT.estimate(forDate));
    }

}