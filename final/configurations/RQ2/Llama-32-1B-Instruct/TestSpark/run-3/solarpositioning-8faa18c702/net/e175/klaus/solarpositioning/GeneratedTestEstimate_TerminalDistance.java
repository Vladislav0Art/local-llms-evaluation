package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestEstimate_TerminalDistance {

    @Test
    public void testEstimate_TerminalDistance() {
        LocalDate forDate = LocalDate.of(2022, 12, 31);
        double expectedDistance = pow(86400 * (365 + 1) / 2 - 30.5, -0.007); // approximately 1 km per year
        double actualDistance = DeltaT.estimate(forDate);
        assertEquals(expectedDistance, actualDistance, 1e-6); // check for floating point precision error
    }

}