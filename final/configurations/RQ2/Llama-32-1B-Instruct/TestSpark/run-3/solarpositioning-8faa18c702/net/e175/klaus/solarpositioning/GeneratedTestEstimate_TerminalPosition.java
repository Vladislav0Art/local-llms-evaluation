package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestEstimate_TerminalPosition {

    @Test
    public void testEstimate_TerminalPosition() {
        LocalDate forDate = LocalDate.of(2022, 12, 31);
        double expectedPosition = pow(86400 * (365 + 1) / 2 - 30.5, -0.007); // approximately 6.67% of the total area per year
        double actualPosition = DeltaT.estimate(forDate);
        assertTrue(Math.abs(actualPosition - expectedPosition) < 1e-6); // check for floating point precision error
    }

}