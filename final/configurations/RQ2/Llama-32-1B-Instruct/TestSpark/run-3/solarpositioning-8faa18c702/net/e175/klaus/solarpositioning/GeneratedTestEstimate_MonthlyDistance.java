package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestEstimate_MonthlyDistance {

    @Test
    public void testEstimate_MonthlyDistance() {
        LocalDate forDate = LocalDate.of(2022, 12, 31);
        double expectedDistance = pow(1000000, -5.7); // approximately 1 km per year
        double actualDistance = DeltaT.estimate(forDate);
        assertEquals(expectedDistance, actualDistance, 1e-6); // check for floating point precision error
    }

}