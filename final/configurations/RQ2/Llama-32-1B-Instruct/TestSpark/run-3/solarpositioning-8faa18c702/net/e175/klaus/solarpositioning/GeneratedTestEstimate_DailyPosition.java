package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestEstimate_DailyPosition {

    @Test
    public void testEstimate_DailyPosition() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double expectedPosition = 0.16666666666666666 * pow(86400, -5.7); // approximately 6.67% of the total area per day
        double actualPosition = DeltaT.estimate(forDate);
        assertTrue(Math.abs(actualPosition - expectedPosition) < 1e-6); // check for floating point precision error
    }

}