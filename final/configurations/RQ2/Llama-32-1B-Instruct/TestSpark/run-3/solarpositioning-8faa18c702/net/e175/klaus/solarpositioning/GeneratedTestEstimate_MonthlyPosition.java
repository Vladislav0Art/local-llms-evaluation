package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestEstimate_MonthlyPosition {

    @Test
    public void testEstimate_MonthlyPosition() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double expectedPosition = 0.16666666666666666; // approximately 6.67% of the total area
        double actualPosition = DeltaT.estimate(forDate);
        assertTrue(Math.abs(actualPosition - expectedPosition) < 1e-6); // check for floating point precision error
    }

}